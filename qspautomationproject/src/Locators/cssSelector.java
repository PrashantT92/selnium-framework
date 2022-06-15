package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.cssSelector("")).sendKeys("Admin");
		driver.findElement(By.cssSelector("")).sendKeys("Admin123");
		driver.findElement(By.cssSelector("")).click();

	}

}
