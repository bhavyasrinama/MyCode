package MaxMin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize {
	
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		//to minimize ( window opens at point of 500,100)
		Point p = new Point(500,100);
		driver.manage().window().setPosition(p);
		driver.get("https://www.google.com/");
		//to set size of window
		Dimension d = new Dimension(300,1080);
		driver.manage().window().setSize(d);
		//to maximize
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.fb.com/");
		

}}
