package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForwardReverse {

	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/BHAVYA/Downloads/ht2.html");
		WebElement we= driver.findElement(By.id("mlb"));
		
		Select sc= new Select(we);
		
		List<WebElement>options = sc.getOptions();
		
		for(WebElement optn:options)
		{
			//to print the options
			String value=optn.getText();
			System.out.println(value);
			Thread.sleep(500);
		}
		
		
		for(int i=0; i<options.size(); i++)
		{
			//System.out.println(options.get());as options is a list , we cat perform this action
			sc.selectByIndex(i);
			Thread.sleep(500);
		}
		
		for(int i=options.size()-1; i>=0; i--)
		{
			
			sc.deselectByIndex(i);
			Thread.sleep(500);
		}
		
		driver.close();
		
	}
		
		
		
}
