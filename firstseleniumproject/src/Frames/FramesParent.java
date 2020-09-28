package Frames;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesParent {
	
	public static void main(String[] args) throws NoSuchElementException{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver(); 
        driver.get("J:\\Selenium_Practice_data\\FramesDemo.html");
        driver.switchTo().frame(0);
        driver.findElement(By.id("d2")).sendKeys("jsp");
        driver.switchTo().parentFrame();// to naviagte to super / parent frame
        driver.findElement(By.id("d1")).sendKeys("qsp");
        driver.switchTo().defaultContent();//to navigate to default parent i.e., main page
        }

}
