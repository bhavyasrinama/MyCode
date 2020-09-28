package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook  {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	WebElement usernm=driver.findElement(By.id("email"));
	usernm.sendKeys("bhavyasri.in@gmail.com");
	//WebElement pswd=driver.findElement(By.id("pass"));
	WebElement pswd=driver.findElement(By.cssSelector("[data-testid='royal_pass']"));
	pswd.sendKeys("99662179");
	//WebElement button=driver.findElement(By.id("u_0_2" ));
	driver.findElement(By.cssSelector("input[value='Log In']")).click();;
	//button.click();
}
}
