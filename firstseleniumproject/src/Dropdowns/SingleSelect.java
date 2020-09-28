package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

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
		System.out.println(sc.isMultiple());


		List<WebElement> options = sc.getOptions();
		for(WebElement availableOptns : options)

		{
			System.out.println("available options are: " + availableOptns.getText());
		}

		sc.selectByValue("d");
		Thread.sleep(1000);

		sc.selectByVisibleText("Idli");
		Thread.sleep(1000);

		sc.selectByIndex(1);
		Thread.sleep(1000);

		/*sc.deselectByIndex(0);
		sc.deselectByValue("d");
		sc.selectByVisibleText("Idli");
		sc.selectByValue("Idli");*/

		WebElement firstSelected=sc.getFirstSelectedOption();
		String firstSelectedOption = firstSelected.getText();

		System.out.println("first selected option is : " + firstSelectedOption);

		List<WebElement> allsel = sc.getAllSelectedOptions();
		for (WebElement allseloptions : allsel )
		{
			System.out.println("slected options are : " + allseloptions.getText());

		}

		sc.deselectAll();
	}
}