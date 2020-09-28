package actions;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	
	
	public static void main(String[] args) throws  InterruptedException, AWTException {
		
	
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
		Actions action = new Actions(driver);
		Robot robo = new Robot();
		
		action.moveToElement(element).click().sendKeys("hiiii").build().perform();
		robo.keyPress(KeyEvent.VK_B);
		robo.keyRelease(KeyEvent.VK_B);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyRelease(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		Thread.sleep(1000);
		
		robo.mouseMove(0, 800);
		for(int i=0; i<=1000; i+=200)
		{
			Thread.sleep(500);
			robo.mouseMove(i,i);
		}
				
		System.out.println("actions class wrked");
		driver.quit();
			
	}
}
