package DataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-h79fojo/login.do");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
	   Thread.sleep(2000);
	   
	   Flib flib = new Flib();
	    String username = flib.readData("./Data/ActitimeTestData.xlsx","validcreds",1,0);

	    String password = flib.readData("./Data/ActitimeTestData.xlsx","validcreds",1,1);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();


	    
	   System.out.println(username);
	   System.out.println(password);
		
		

	}

}
