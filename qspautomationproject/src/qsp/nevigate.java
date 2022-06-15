package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///c:/User/HP/Desttop/1wcsm7htmldocs/check.html");
		String sourceCodeOfTheWebPage=driver.getPageSource();
		System.out.println(sourceCodeOfTheWebPage);

	}

}
