package javascriptExecutor;

import java.awt.Point;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragtoSpecificElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
      org.openqa.selenium.Point loc = news.getLocation();
     int xaxis = loc.x;
     int yaxis = loc.x;
       jse.executeScript("window.scrollBy("+0+","+xaxis+")");
     
		
	}

}
