package assigenment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mozilafirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.gmail.com");
	    
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rajputrahul12797@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		System.out.println("gamil is opened");
		
		
		
		
		
	}

}
