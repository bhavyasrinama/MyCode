package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//get java representative object of the physical file
		
		FileInputStream fis = new FileInputStream("./data/ExcelDataSheet.xlsx");
	// open excel in read mode or create workbook	
		Workbook wb = WorkbookFactory.create(fis);
		//get control of the sheet
		Sheet sh = wb.getSheet("Sheet1");
		//get control of row
		Row r  = sh.getRow(2);
		// get control of cell
		Cell c = r.getCell(0);
		//c.getNumericCellValue() is used when value in sheet is "78988" with out single code as it is treated as int
		//read string data when single code is there e.g., " '12343 " treated as string 
		String data = c.getStringCellValue();
		//c.toString() can also be used
		//to print on console
		System.out.println(data);
		//close the workbook
		wb.close(); 	
	}

}
