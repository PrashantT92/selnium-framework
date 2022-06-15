package Windowpopos;

import java.io.File;
import java.io.IOException;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://desktop-h79fojo/login.do");
	     
	     driver.findElement(By.name("username")).click();
	     driver.findElement(By.name("pwd")).click();
	     driver.findElement(By.id("loginButton")).click();
	     
	     driver.findElement(By.partialLinkText("Settings")).click();
	     driver.findElement(By.partialLinkText("Logo")).click();
	     
	     driver.findElement(By.id("/uploadNewLogoOption")).click();
	     
	    Actions act = new Actions(driver);
	    
	   WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	   act.doubleClick(target).perform();
	   
	  File abs = new File("./autoitscripts/Fn1.exe");
	  String path = abs.getAbsolutePath();
	  Runtime.getRuntime().exec(path);
	  Thread.sleep(2000);
	  Runtime.getRuntime().exec(path);

	  
	    
	    
	    

		    
	     

	}

}
