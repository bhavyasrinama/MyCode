import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {


	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		Thread.sleep(6000);

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File desFile = new File(".\\screenshots\\naukri.png");

		FileUtils.copyFile(srcFile, desFile);

		driver.close();
	}

}
