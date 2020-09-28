package New.PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUP {
	
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		// to click on log in button
		//driver.findElement(By.className("_3Ep39l")).click();
		//to click on 'X' to close the popup
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.className("_3Ep39l")).click();
		
		
		
	}
	

}
