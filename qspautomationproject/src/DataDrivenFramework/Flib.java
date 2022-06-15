package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readData(String excelPath, String Sheetname, int rowcount, int cellCount) throws EncryptedDocumentException, IOException
{
	FileInputStream fil= new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fil);
    Sheet sh = wb.getSheet(Sheetname);
     Row Row = sh.getRow(rowcount);
      Cell cell = Row.getCell(cellCount);
      String data = cell.getStringCellValue();
      return data;
      
}
		
public int getRowcount(String excelPath, String Sheetname) throws EncryptedDocumentException, IOException
{
	
FileInputStream fil= new FileInputStream(excelPath);
Workbook wb = WorkbookFactory.create(fil);
Sheet sh = wb.getSheet(Sheetname);
 int rc = sh.getLastRowNum();
return rc;



}

public String writeExcelData(String excelPath, String Sheetname, int rowcount, int cellCount,String data) throws EncryptedDocumentException, IOException
{
FileInputStream fil= new FileInputStream(excelPath);
Workbook wb = WorkbookFactory.create(fil);
Sheet sh = wb.getSheet(Sheetname);
 Row Row = sh.getRow(rowcount);
  Cell cell = Row.createCell(cellCount);
  cell.setCellValue(data);
  FileOutputStream fos = new FileOutputStream(excelPath);
  wb.write(fos);
return data;
}

}



