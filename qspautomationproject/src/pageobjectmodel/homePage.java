package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage
{
   //declartion
	@FindBy(xpath="//a[.='Logout']") private WebElement loginlink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement createnewtask;
	@FindBy(xpath="//div[.='Settings']") private WebElement setting;
	@FindBy(id="SubmitTTButton") private WebElement savebutton ;
	
     
	//initalization
	
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//utilization
	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getCreatenewtask() {
		return createnewtask;
	}
	public WebElement getSetting() {
		return setting;
	}
	
	//logout operation
	
	public void clicklogoutbutton() {
		loginlink.click();
	}
	
     public void clickSaveTimeBtn() {
    	 
    	 savebutton.click();
     }
     
	}


