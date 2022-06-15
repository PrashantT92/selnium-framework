package selectionclss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sectccase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Downloads/multiselectdropdown.html");
        
		WebElement dropdownelement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdownelement);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("file:///C:/Users/Shree/Downloads/multiselectdropdown.html");
        
		WebElement dropdownelement1 = driver1.findElement(By.id("menu"));
		Select sel1=new Select(dropdownelement1);
		sel1.selectByVisibleText("2");

		
		
	}

}
