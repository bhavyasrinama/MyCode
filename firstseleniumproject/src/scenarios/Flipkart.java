package scenarios;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	static{
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11"+Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> mobileCost=driver.findElements(By.xpath("//div[@class='_3wU53n']/../..//div[@class='_1vC4OE _2rQ-NK']"));
		for(int i=0;i<mobiles.size();i++){
			String mobileText = mobiles.get(i).getText();
			String mobilePrice=mobileCost.get(i).getText();
			System.out.println(mobileText+" => "+mobilePrice);
			}
	}

}
