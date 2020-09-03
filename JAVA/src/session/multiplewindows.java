package session;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class multiplewindows {

	static WebDriver driver;
	
	public static void main(String[] s)
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
	
		 /*if(headlessproperty.equals("yes"))
		 {
  ChromeOptions options=new ChromeOptions();
options.addArguments("--headless");
WebDriver driver=new ChromeDriver(options);
		 }
*/
		
	
	
		
		
		
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		 driver=new FirefoxDriver(options);
		
		
		
		driver.navigate().to("https://www.hyrtutorials.com/");
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'Selenium Practice')]"));
		act.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[starts-with(text(),'Waits')]//following::a")).click();
		
		
	
String parent=driver.getWindowHandle();
	System.out.println("parent window"+parent+"-"+driver.getTitle());
	
	driver.findElement(By.xpath("//button[@id='newWindowBtn'][@class='whButtons']")).click();
	Set<String> handles=driver.getWindowHandles();
	for(String handle:handles)
	{
		System.out.println("child windows"+handle+" -"+driver.getTitle());
		if(!handle.equals(parent))
		{
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
			driver.findElement(By.id("firstName")).sendKeys("mohankumar");
		}
		
	}
	
	
	driver.switchTo().window(parent);
	driver.findElement(By.id("name")).sendKeys("mohankumar");
	driver.close();
	
	}
	
	public static void teardown()
	{
		driver.quit();
	}

}
