package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nametwitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		driver.findElement(By.name("text")).sendKeys("Admin");
		driver.findElement(By.name("css")).sendKeys("Admin123");
		

	}

}
