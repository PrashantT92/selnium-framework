package teastNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
	WebDriver driver;
	
  @Test
  public void b() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.switchTo().activeElement().sendKeys("java");
	  
	  
  }
}
