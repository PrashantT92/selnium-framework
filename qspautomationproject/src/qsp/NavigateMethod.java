package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args)  throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http:/www.google.com");
			driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
			driver.navigate().back();
			Thread.sleep(8000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
		

	}

}