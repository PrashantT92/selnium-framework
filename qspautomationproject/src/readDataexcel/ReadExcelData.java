package readDataexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./Data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);	
        org.apache.poi.ss.usermodel.Sheet wc = wb.getSheet("Sheet1");
      Row row = wc.getRow(4);
     Cell cell = row.getCell(1);
     String data = cell.getStringCellValue();
     System.out.println(data);
				
			
				
				
				
				
				
				
				
				
				
				
				

	}

}
