package assigenment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Actions act=new Actions(driver);
		 WebElement ele = driver.findElement(By.xpath("//span[.='Offers '] "));
		
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//span[.='10% Making Charges Off on Plain Gold Jewellery']")).click();
	WebElement offer = driver.findElement(By.xpath("(//span[@class='offer'])[1]"));
System.out.println(offer.getText());
driver.quit();
	}

}
