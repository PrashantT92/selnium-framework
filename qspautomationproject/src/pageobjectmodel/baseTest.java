package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseTest implements IAutoConstant {
      static WebDriver driver;
      public void setup() throws IOException
      {
	    Flib flib = new Flib();
		String url = flib.readPropertyFile(PropertiesPath, "url");

	    String browservalue = flib.readPropertyFile(PropertiesPath,"browser");	
	    
	    if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(ChromeKey,ChromeValue);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		}
 
	    else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(Firefoxkey,FirfoxValue);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

		}
		else
		{
			System.out.println("enter the correct choice");
		}



	}



	public void tearDown()
	{
		driver.quit();
	}
	}




