package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollright {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
     
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    Thread.sleep(2000);
    jse.executeScript("window.scrollBy(200,0)");
    
    
	}

}
