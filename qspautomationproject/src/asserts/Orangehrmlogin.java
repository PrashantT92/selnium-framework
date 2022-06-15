package asserts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Orangehrmlogin {
	WebDriver driver;
	@BeforeTest
	public void setProperty() {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@BeforeMethod
	public void lounchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
  @Test		

  public void testcase() throws InterruptedException
  {
	  SoftAssert softAssert = new SoftAssert();
	  String actualloginpagTittle = driver.getTitle();
	  softAssert.assertEquals(actualloginpagTittle, "OrangeHRM");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	 WebElement dashBord  = driver.findElement(By.xpath("//h1[.='Dashboard']"));
	 boolean statusDashBord = dashBord.isDisplayed();
	 Assert.assertEquals(statusDashBord, true);
	  Thread.sleep(4000);
	  
	  
	  String actualHomePageTittle = driver.getTitle();
	  softAssert .assertEquals(actualHomePageTittle, "OrangeHRMHomeePage");
		 Reporter.log("create user",true);
		 Reporter.log("create contact",true);
		 softAssert.assertAll();

			  
	  
  }
}
