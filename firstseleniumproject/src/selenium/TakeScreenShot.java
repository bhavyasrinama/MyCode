package selenium;

import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.io.File;



public class TakeScreenShot extends BaseClass {
	public static void main(String[] args) throws IOException{
		driver.get("http://www.google.com");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		File destSnapshot=new File(".//screenshots//google.png");
		FileUtils.copyFile(scrFile, destSnapshot);
		
	}

}
