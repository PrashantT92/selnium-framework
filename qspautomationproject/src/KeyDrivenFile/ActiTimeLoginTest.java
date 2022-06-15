package KeyDrivenFile;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeLoginTest extends baseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		baseTest bt = new baseTest();
		Flib flib = new Flib();
		String username = flib.readPropertyFile("./data/config.propeties","username");
		String password = flib.readPropertyFile("./data/config.propeties","password");
		
		bt.openBrowser();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		bt.closeBrowser();
		
	}

}
