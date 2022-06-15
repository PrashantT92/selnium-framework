package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis= new FileInputStream("./Data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);	
        org.apache.poi.ss.usermodel.Sheet wc = wb.getSheet("validcreds");
      Row row = wc.getRow(0);
     Cell cell = row.createCell(4);
     cell.setCellValue("Rohan");
     
      FileOutputStream fos = new FileOutputStream("./Data/ActiTimeTestData.xlsx");
      wb.write(fos);
      
 
	}

}
