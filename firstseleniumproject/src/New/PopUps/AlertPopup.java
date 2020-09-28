package New.PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		//to create alert popup
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		

		jse.executeScript("alert(' I am alert popup')");
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();//to navigate to alert window//
		// it returns alert type , so stored in alert type variable//
		
		
		System.out.println(alert.getText());
		
		Thread.sleep(1000);
		alert.accept();
	}
		
}
