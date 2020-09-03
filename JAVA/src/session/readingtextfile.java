package session;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class readingtextfile {
	
	
	public static void main(String[] s) throws IOException, InterruptedException
	{
	int linecount=0;
	int iteration=0;
		FileReader r=new FileReader("C:\\Users\\Mohan raji\\Desktop\\moan.txt");
		BufferedReader br=new BufferedReader(r);
		String line;
		while((line=br.readLine())!=null)
		{
			String data[]=line.split(", ",2);
			linecount=linecount+1;
			iteration=iteration+1;
		if(linecount>1)
		{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver=new FirefoxDriver(options);
		driver.navigate().to("https://abnd-test.fingent.net/v1/#/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data[0]);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data[1]);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		if(url.equals("https://abnd-test.fingent.net/v1/#/programs/list"))
			{
			
			
			System.out.println(iteration+"passed");
			
			}
		else
		{
			System.out.println(iteration+"failed");	
		}
		}
	}
	}
}
