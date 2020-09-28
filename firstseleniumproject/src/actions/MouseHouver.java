package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHouver {
	
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement Resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Actions a = new Actions(driver);
		a.moveToElement(Resources).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h6[contains(text(),'Contact')]")).click();
		String number = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(number);

}
}