package session;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class scrollintoview {

	static WebDriver driver;
	
	public static void main(String[] s)
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		
		
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		 driver=new FirefoxDriver(options);
		
		
		
		driver.navigate().to("https://www.hyrtutorials.com/");
		
		

		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'Selenium Practice')]"));
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[starts-with(text(),'Waits')]//following::a")).click();
		
		
		
		WebElement ele1=driver.findElement(By.xpath("//input[@id='name']//preceding::p"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);",ele1);
		
		System.out.println(ele1.getText());
	}
}
