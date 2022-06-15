package pageobjectmodel;

import java.io.IOException;

public class TestActtiTimeSaveLeaveBtn extends baseTest{

	public static void main(String[] args) throws IOException {
		
		baseTest bt = new baseTest();
		bt.setup();
		loginPage lp = new loginPage(driver);
		  Flib flib = new Flib();
		 String username = flib.readPropertyFile(PropertiesPath, "username");
		 String password = flib.readPropertyFile(PropertiesPath, "password");
		 lp.actiTimevalidlogin(username,password);
		 
           homePage ho = new homePage(driver);	
           ho.clickSaveTimeBtn();
            
	
	}

}
