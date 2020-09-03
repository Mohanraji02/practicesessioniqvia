package session;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class clear {
	
	
	public static void main(String[] s)
	{
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		
		
		
		WebDriver driver=new FirefoxDriver(options);
		driver.navigate().to("https://abnd-test.fingent.net/v1/#/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mohankumar@gmail.com");
		System.out.println(driver.findElement(By.xpath("//input[@type='email']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		
	}
	
	
	
	

}
