package takeScreenShotDynamically;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Basetest {
	static WebDriver driver;
	
   public static void intialization() {
	  System.setProperty("deiver./chrome/driver","./drivers.chromedriver.exe");
	  new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }
  
 
  public void  failed(String methodName)
  {
  try {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./screenShots/"+methodName+".png");
	 Files.copy(src, dest);
  
  }
   catch(Exception e) {}
  
  }
}
