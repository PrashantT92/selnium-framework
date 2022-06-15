package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
  //declartion
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pwd;
	@FindBy(id="loginButton") private WebElement loginbutton;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licsenkey;
	
	//initalizatio
	

public loginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


   //utilization




public WebElement getUsn() {
	return usn;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getLoginbutton() {
	return loginbutton;
}
public WebElement getLogo() {
	return logo;
}

public WebElement getLicsenkey() {
	return licsenkey;
}
	
	public void  actiTimevalidlogin(String usernmae,String password)
	{
		usn.sendKeys(usernmae);
		pwd.sendKeys(password);
		loginbutton.click();
	}
	public void  actiTimeInvalidlogin(String usernmae,String password)
	{
		usn.sendKeys(usernmae);
		pwd.sendKeys(password);
		loginbutton.click();
		usn.clear();
	}
	
	}
   

