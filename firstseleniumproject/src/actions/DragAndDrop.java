package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions actions = new Actions(driver);


		//actions.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();

		actions.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		driver.close();


	}
}


