package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main (String [] args) throws InterruptedException {

		//Instantiation of driver object. To launch Firefox browser

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//To open url

		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// find the SoftwareTestingMaterial logo using linkText Locator
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.linkText("Software Testing Material"));

		//Used points class to get x and y coordinates of element.

		Point point = element.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");

		// Using Actions class

		Actions action = new Actions(driver);

		//clicking on the logo based on x coordinate and y coordinate 
		//you will be redirecting to the home page of softwaretestingmaterial.com

	//action.moveToElement(element, xcord, ycord).click().build().perform();
	
	action.moveToElement(element).perform();

		/*((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+element.getLocation().y+")");
		     element.click();
		/*JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
		     executor.executeScript("arguments[0].click();", element);*/
	} }