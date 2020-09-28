package autoSuggestion;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Prog2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

		/*Scanner sc = new Scanner(System.in);
		System.out.println("nter the url");
		String url =sc.next();*/
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver.get("https://www.cleartrip.com/");

		//driver.get(url);//https://www.cleartrip.com/
		driver.findElement(By.xpath("//input[@name='origin']")).sendKeys("ban");
		Thread.sleep(4000);
		List<WebElement>  options =driver.findElements(By.xpath("//li[@class='list']"));

		int count = options.size();
		System.out.println(count);
		for(WebElement autoSugg : options)
		{
			String suggestion =autoSugg.getText();
			System.out.println(suggestion);
			if(suggestion.contains("Bangalore"))
			{
				autoSugg.click();
			}

		}

	}}
