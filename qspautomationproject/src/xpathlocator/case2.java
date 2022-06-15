package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/m/login");
		
	 driver.findElement(By.xpath("//input[contains(@placeholder(),'Enter your Email ID or Mobile No.')]")).sendKeys("8975755006");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[contains(@class,'B14')]")).click();
	 Thread.sleep(3000);
	 driver.close();
	    

	}

}
