package New.PopUps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentWindow {

	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) {
		//String expeTitle="popup6";
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/popuptest1.html");
		// if u want to close only parent window then only driver.close() is req
		//driver.close();
		Set<String> allWin =driver.getWindowHandles();
		System.out.println(allWin.size());
		for(String win:allWin)
		{
			driver.switchTo().window(win);
			//to print address of all windows
			System.out.println(win);
			// to print title of window
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}}
