package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesDemo {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		int i;
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);

		List<WebElement> allAutoSug=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allAutoSug.size();

		for(i=0;i<count;i++)
		{
			String text = allAutoSug.get(i).getText();
			System.out.println(text);
		}
		allAutoSug.get(3).click();
		driver.close();


	}

}
