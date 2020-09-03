package session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class frames {

	static WebDriver driver;
	public static void main(String[] s)
	{
		String headless="yes";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		if(headless.equals("yes"))
		{
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		options.addArguments("--headless");
		 driver=new FirefoxDriver(options);
		}
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select s1=new Select(driver.findElement(By.id("course")));
		s1.selectByVisibleText("Java");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).sendKeys("kumar");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("sairam");
		
		
		
		
	}
}
