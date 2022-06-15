package assigenment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario13 {


	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.navigate().to("https://www.bluestone.com/");
	 
	 driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
	 
	 
	 driver.findElement(By.xpath("//span[@data-p='offers,m']")).click();
	 Actions act=new Actions(driver);
	 driver.findElement(By.xpath("//span[.='Offers']/ancestor::section[@id='Offers-form']")).click();
	
	 
    
	 System.out.println("select 20% Moking Charge");

	 

		
	}

}
