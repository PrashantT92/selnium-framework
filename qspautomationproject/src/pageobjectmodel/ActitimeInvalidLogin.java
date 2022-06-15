package pageobjectmodel;

import java.io.IOException;

public class ActitimeInvalidLogin extends baseTest {

	public static void main(String[] args) throws IOException {
		 baseTest bs = new baseTest();
         bs.setup();
         loginPage lp = new loginPage(driver); 
  Flib flib = new Flib();
 int rc = flib.getRowCount(ExcelPath,"invalidcreds" );
 
  for(int i=1;i<=rc;i++)
  {
 String username = flib.readExcelData(ExcelPath, "invalidcreds", i, 0);
 String password = flib.readExcelData(ExcelPath, "invalidcreds", i, 1);
 lp.actiTimeInvalidlogin(username, password);
 flib.writeExcelData(ExcelPath, "invalidcreds", i, 2, "pass");
	}
	
}
}
