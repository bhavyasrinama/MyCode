package dataProvider;

import java.io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {


	
	public void readExcel()  {
		
		FileInputStream fs = new FileInputStream("./data/ExcelDataSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		
	
	Sheet sh = wb.getSheet("Sheet1");
		Row r  = sh.getRow(2);
		Cell c = r.getCell(0);
		String data = c.getStringCellValue();
		System.out.println(data);
		

		// TO get the access to the sheet
		Sheet sh1 =  wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh1.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh1.getColumns();

		for (int row = 0; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sh1.getCell(col, row).getContents() + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		ReadExcelFile DT = new ReadExcelFile();
		DT.readExcel();
	}
}
}
