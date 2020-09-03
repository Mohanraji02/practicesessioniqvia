package session;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class alerts {
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
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		WebElement ele=driver.findElement(By.id("alertBox"));
		for(int i=0;i<3;i++)
		{
			
		switch(i)
		{
		
		case 0:
	if(ele.isDisplayed())
	{
		ele.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		
	}
	else
	{
		System.out.println("not displayed");
	}
	
	break;
		case 1:
			WebElement ele1=driver.findElement(By.id("confirmBox"));
	if(ele1.isEnabled())
	{
		ele1.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
	}
	else
	{
		System.out.println("not");
	}
break;	
	}
}
}}