package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFrmSheet {

	public void readExcelfile(String filePath,String fileName, String sheetName) throws IOException
	{
		//Create an object of File class to open xlsx file
		File file= new File(filePath+"\\"+fileName);
		//Create an object of FileInputStream class to read xlsx file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = null;
		//Find the file extension by splitting file name in substring  and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		//Check condition if the file is xlsx file

		if(fileExtensionName.equals(".xlsx"))
		{

			//If it is xlsx file then create object of XSSFWorkbook class

			workbook = new XSSFWorkbook(inputStream);
		}
		//check if file is xls extension

		else if(fileExtensionName.equals(".xls"));
		{

			//If it is xls file then create object of HSSFWorkbook class

			workbook = new HSSFWorkbook(inputStream);

		}

		//read sheet inside the workbook by its name
		
		Sheet sheet = workbook.getSheet(sheetName);
		//to find no. of rows in sheet
		int noOfRows = sheet.getLastRowNum()- sheet.getFirstRowNum();
		  //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < noOfRows+1; i++) {

	        Row row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();}
	    } 
	  //Main function is calling readExcel function to read data from excel file

	    public static void main(String...strings) throws IOException{

	    //Create an object of ReadGuru99ExcelFile class

	    	ReadFrmSheet objExcelFile = new ReadFrmSheet();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"\\src\\ExcelDataSheet";

	    //Call read file method of the class to read data

	    objExcelFile.readExcelfile(filePath,"ExcelDataSheet.xlsx","ExcelDemo");

	    }

	}

	    
