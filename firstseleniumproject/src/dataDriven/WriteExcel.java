package dataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// To read data from external resource or get java object in read mode
		FileInputStream fis= new FileInputStream("./data/ExcelDataSheet.xlsx");
		//open or go to workbook
		Workbook wb = WorkbookFactory.create(fis);
		//write data
		 wb.getSheet("Sheet1").getRow(2).getCell(3).setCellValue("pass");
		 //open file in write mode
		 FileOutputStream fos = new FileOutputStream("./data/ExcelDataSheet.xlsx");
		 // save workbook in write mode(actual writings happen here
		wb.write(fos);
		// close workbook
		wb.close();

	}

}
