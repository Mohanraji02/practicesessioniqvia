package session;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class links 
{
	static WebDriver driver;
	public static void main(String[] s) throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		
		
		
		 driver=new FirefoxDriver(options);
		driver.navigate().to(readfile("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		links.screenshot("login");
String title=driver.getTitle();
		
if(title.equalsIgnoreCase("Facebook – log in or sign up"))
{
	

try
		{
	

 		
			List<WebElement> links=driver.findElements(By.tagName("a"));
			int a =links.size();
		System.out.println("total links are"+a);
		for(int i=0;i<a;i++)
		{
			WebElement ele=links.get(i);
			String linkss=ele.getAttribute("href");
		verifylinkactive(linkss);
		
		}
		}
	


catch(NoSuchElementException e)
{
	System.out.println(e.getMessage());
}
}



else
{
System.out.println("invalid credentials you have logged in");
}




	}
	
	
	public static void verifylinkactive(String linkss) throws IOException
	{

		URL url=new URL(linkss);
		HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
		httpurlconnect.setConnectTimeout(3000);
		httpurlconnect.connect();
		if(httpurlconnect.getResponseCode()==200)
		{
			System.out.println(linkss+" "+"-"+httpurlconnect.getResponseMessage());
		}
		if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkss+" "+"-"+httpurlconnect.getResponseMessage()+HttpURLConnection.HTTP_NOT_FOUND);
		}
		
	}
	
	
public static String readfile(String property) throws IOException
{
	Properties pro=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\webelement.properties");
	pro.load(fis);
	return (pro.getProperty(property));
	
}
	
public static void screenshot(String filename) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./screens/"+filename+".png"));
	
}
}