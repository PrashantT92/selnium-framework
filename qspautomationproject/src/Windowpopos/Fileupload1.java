package Windowpopos;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("http://desktop-h79fojo/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[@class='content administration']")).click();
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Actions act =new Actions(driver);
		 WebElement uplod = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));

		act.doubleClick(uplod).perform();
		
		File fil=new File("./autoitscripts/rahul1.exe");
		String ab = fil.getAbsolutePath();
		
		Runtime.getRuntime().exec(ab);
		Thread.sleep(4000);
		Runtime.getRuntime().exec(ab);

		

	}

}

