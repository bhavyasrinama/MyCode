package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementReferenceExe {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement untb=driver.findElement(By.id("username"));
		untb.sendKeys("admin1");
		driver.navigate().refresh();
		untb.sendKeys("admin2");
		
	}

}
