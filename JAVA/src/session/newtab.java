package session;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class newtab {
	public static FileInputStream fis;
	public static WebDriver driver;
	static Properties property;
	public  static Properties readfile() throws IOException
	{
	
		FileInputStream	 fis=new FileInputStream("mohan.properties");	
		 property=new Properties();
		property.load(fis);
		return property;
		
	}
	

	
	
	@Test
	public void exe() throws IOException
	
	{
		
		
		
		readfile();
		 String url1= property.getProperty("url");
	System.setProperty("webdriver.gecko.driver", property.getProperty("path"));
	FirefoxOptions options=new FirefoxOptions();
	options.setCapability("marionette", false);
	WebDriver driver=new FirefoxDriver(options);
		
		driver.navigate().to(url1);
		
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'Create a Page')]"));
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		ele.sendKeys(selectLinkOpeninNewTab);}
		
	

	
	
	

}