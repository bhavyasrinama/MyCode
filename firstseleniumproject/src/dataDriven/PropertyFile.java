package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {

		//To convert external file to the form of java object
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		//Create an object of properties class
		Properties p = new Properties();
		//To load file
		p.load(fis);
		//get the data value by passing key
		String URL = p.getProperty("url");
		String UN= p.getProperty("username");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
	}

}
