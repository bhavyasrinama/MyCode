package com.practice.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * (/**+Enter)
 * This is generic class for data driven testing
 * @author BHAVYA
 *
 */

public class CommonData {
	/**
	 * @param key
	 * @return String
	 * @throws IOException 
	 */

	public String getProprtyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value=p.getProperty(key);	
		return value;
		
		}	
	
	/**
	 * 
	 * @param epath
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String epath, String sheetName, int rowNum,int cellNum) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(epath);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		
	}
	
	/**
	 * 
	 * @param epath
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param setValue
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public void setExcelData(String epath, String sheetName, int rowNum,int cellNum, String setValue) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(epath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).setCellValue(setValue);
		FileOutputStream fos =new FileOutputStream(epath);
		wb.write(fos);
		wb.close();
		
	
	}
	

}
