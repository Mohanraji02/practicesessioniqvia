package session;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class abndlogin {
	
	
	public static void main(String[] s) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver=new FirefoxDriver(options);
		driver.navigate().to("https://abnd-test.fingent.net/v1/#/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mohan.kumar@fingent.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rajimohan");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
	String url=driver.getCurrentUrl();
	try
	{
		
		
if(url.equals("https://abnd-test.fingent.net/v1/#/programs/list"))
{
System.out.println("login passed");	
}
else
{
	System.out.println("login failed");		
}
	
	}
	catch(NoSuchElementException e)
	{
		System.out.println(e.getMessage());
	}
	}

}
