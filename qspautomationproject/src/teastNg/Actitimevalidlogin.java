package teastNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Actitimevalidlogin {
	WebDriver driver;
  @Test
  @Parameters({"browser","username","password","url"})
  public void validlogin(String browservalue,String username,String password,String url) throws InterruptedException {
	  if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	          driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			
		}
	
		 else if (browservalue.equalsIgnoreCase("firefox"))
		 {

				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		          driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
				Thread.sleep(2000);
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.id("loginButton")).click();
		}  
			
	
		else
		{
		    System.out.println("enter the correct choice");
		}
	
		
  }
}
