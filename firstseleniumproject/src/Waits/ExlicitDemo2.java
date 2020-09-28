package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExlicitDemo2 {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://seleniumatfingertips.wordpress.com");
			driver.manage().window().maximize();

		WebElement element = driver.findElement(By.linkText("Home"));

		// waits until Home link is visible on the web page

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));

		element.click();

		// waits until About link is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About")));

			driver.quit();
		
		
		
	}
}

