package DataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-h79fojo/login.do");
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
	   Thread.sleep(2000);
	   
	   Flib flib = new Flib();
	   int inv = flib.getRowcount("./Data/ActitimeTestData.xlsx","sheet2");
	   for(int i=1;i<inv;i++)
	   {
		   
	   
	    String username = flib.readData("./Data/ActitimeTestData.xlsx","invalidcreds",1,0);

	    String password = flib.readData("./Data/ActitimeTestData.xlsx","invalidcreds",1,1);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='username']")).clear();
		   System.out.println(username);
		   System.out.println(password);


	   }


	    

	}

}
