package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/ExcelDataSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet("Sheet1").getRow(1).getLastCellNum();
		
		System.out.println(rowCount);
		for(int i = 1; i<=rowCount ;i++)
		{
			String un =wb.getSheet("Sheet1").getRow(i).getCell(0).toString();
			String pw =wb.getSheet("Sheet1").getRow(i).getCell(1).toString();
			System.out.println(un+"\t"+pw);
		}

	}

}
