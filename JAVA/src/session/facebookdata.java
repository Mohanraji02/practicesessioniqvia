package session;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebookdata {
	
	WebDriver driver;
	
	
	@Test(dataProvider="testdata")
	public void start(String user,String pass)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		
		
		try
		{
		 driver=new FirefoxDriver(options);
		driver.navigate().to("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("u_0_b")).click();
		
		String title=driver.getTitle();
		if(title.equals("Facebook"))
		{
			System.out.println("credentials are valid"+user);
		
		}
		else
		{
			System.out.println("credentials not valid"+user);
		}
		
		
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	@DataProvider(name="testdata")
	public Object[][] configdata()
	{
		
		facebookexcel excel=new facebookexcel("C:\\Users\\Mohan raji\\Desktop\\mohan.xlsx");
		int rows=excel.getrow(0);
		Object[][] pass=new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
		pass[i][0]=	excel.getdata(0, i, 0);
			pass[i][1]=excel.getdata(0, i, 1);
		}
		return pass;
	}
}
