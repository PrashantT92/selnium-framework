package KeyDrivenFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeinvalidtest extends baseTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
     baseTest bt = new baseTest();
     bt.openBrowser();
     Thread.sleep(3000);
     
    Flib flib = new Flib();
   int rc = flib.getRowcount("./Data/ActiTimeTestData.xlsx", "invalidcreds");
   
   for(int i=1;i<=rc;i++)
   {
	
	     String username = flib.readData("./Data/ActiTimeTestData.xlsx","invalidcreds",i,0);
         String password = flib.readData("./Data/ActiTimeTestData.xlsx","invalidcreds",i,1);
         
         
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@name='username']")).clear();
		 
   }
   bt.closeBrowser();
	}

}
