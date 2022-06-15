package assigenment3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senario16 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.navigate().to("https://www.bluestone.com/");
		 
		 driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		 WebElement tar = driver.findElement(By.xpath("//a[.='Coins ']"));
		 
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(tar).perform();
		 driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-20gms,m']")).click();
		 WebElement weight=driver.findElement(By.xpath("//span[.='(20 gram)']"));
	String ele = weight.getText();
	
	if(ele.equalsIgnoreCase("(20 gram)"))
	{
		 
	    
		 System.out.println("20gm coin is dispaly");
	}
	else
	{
		 System.out.println("test cse is fale");
	}
driver.quit();

	}

}
