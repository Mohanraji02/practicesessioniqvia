package session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class alignment {
	
	
	public static void main(String[] s)
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		
		
		
		WebDriver driver=new FirefoxDriver(options);
		driver.navigate().to("https://abnd-test.fingent.net/v1/#/login");
		
	int a=	driver.findElement(By.xpath("//input[@type='email']")).getSize().getHeight();
	int a1=	driver.findElement(By.xpath("//input[@type='password']")).getSize().getWidth();
	int b=	driver.findElement(By.xpath("//input[@type='email']")).getSize().getHeight();
	int b1=	driver.findElement(By.xpath("//input[@type='password']")).getSize().getWidth();	
	if(a==b)
	{
		System.out.println("same height");
		
	}
	else
	{
		System.out.println("different height");
	}
		
		
	}

}
