package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSlector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

		driver.close();
	}

}
