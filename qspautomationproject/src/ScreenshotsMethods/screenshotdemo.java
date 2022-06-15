package ScreenshotsMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotdemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/?hl=en");
		
		//way 6
		CharSequence tarate655;
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tarate655");
		int prashant;
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("prashant@92");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		
		driver.findElement(By.xpath("//div[@class='eyXLr']")).click();
		
		driver.findElement(By.xpath("//div[.='🌸kadam _pranali🌸']")).click();
	    WebElement src = driver.findElement(By.xpath("//header[@class='zw3Ow ']"));
	File target = src.getScreenshotAs(OutputType.FILE);
	File fil=new File("./screenshots/insta1.png");
	Files.copy(target, fil);
		
	
		


				

	}

}
