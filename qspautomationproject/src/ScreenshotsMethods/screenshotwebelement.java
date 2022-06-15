package ScreenshotsMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotwebelement {


	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/?hl=en");
		
		//way 6
		WebElement imgaddress=driver.findElement(By.xpath("//div[@id='f10f6b4ddceb7f']"));


				File src= imgaddress.getScreenshotAs(OutputType.FILE);
			    File dest= new File("./screenShots/selenium6.png");
			    Files.copy(src,dest);
			   
			}
	}


