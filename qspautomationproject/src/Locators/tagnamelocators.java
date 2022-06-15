package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamelocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/selenium%20files/radioButton.html");
		driver.findElement(By.tagName("input")).sendKeys("admin");

	}

}
