package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Facebooklogin extends BaseClass {
public static void main(String[] args) {
	
	driver.get("https://www.gmail.com");
	
	WebElement unTb = driver.findElement(By.xpath("//*[@id='Email']"));
	unTb.sendKeys("bhavyasri.in@gmail.com");
	boolean displayed = unTb.isDisplayed();
	if(displayed)
	{
		System.out.println("usernm tb is displayed");
	}
	else
	{
		System.out.println("usernm tb is not displayed");
	}
	driver.findElement(By.id("next")).click();
	
}
}
