package selenium;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement usernm=driver.findElement(By.id("email"));
		usernm.sendKeys("bhavyasri.in@gmail.com");
		Robot r= new Robot();
		Actions action = new Actions(driver);
		//action.username.
		
	}

}
