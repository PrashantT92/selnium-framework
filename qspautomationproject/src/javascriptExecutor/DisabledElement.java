package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shree/Desktop/pra.html");
		

		
		JavascriptExecutor jse=(JavascriptExecutor)driver;  
		WebElement usn = driver.findElement(By.id("i1"));
		if(usn.isEnabled())
		{
			usn.sendKeys("prashant");
		}
		else
		{
			System.out.println("elese block executed");
			jse.executeScript("document .getElementById('i1').value='prashant'");
			
		}
			WebElement pass = driver.findElement(By.id("id2"));
			if(pass.isEnabled())
			{
				pass.sendKeys("manger");
			}
			else
			{
				jse.executeScript("document .getElementById('i1').value='manger'");
			}
				
	}

}
