package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNewjavawindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
	
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("vivo T1 5G");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@class='fMghEO']/preceding-sibling::div[.='vivo T1 5G (Starlight Black, 128 GB)']")).click();
	String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
for(String ch:child)
{
	System.out.println(ch);
	if(!parent.equals(ch))
	{
		driver.switchTo().window(ch);
		driver.findElement(By.xpath("//a[.='8 GB']")).click();
		driver.findElement(By.xpath("//button[.='BUY NOW']")).click();
	}		

}
	
	}

}
