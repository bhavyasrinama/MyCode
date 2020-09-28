package New.PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("Window.scroll(0,800)");// this is absolute scroll: goes to excat position
		//jse.executeScript("Window.scrollBy(0,800)");// this is relative scroll: goes to +800 pixels of current  position
		
	}
		
}
