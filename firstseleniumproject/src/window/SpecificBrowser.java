package window;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBrowser {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	
	public static void main(String[] args) {
		String expeTitle="popup6";
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/popuptest1.html");
		Set<String> allWin =driver.getWindowHandles();
		for( String Window : allWin)
		{
			driver.switchTo().frame(Window);
			String ActualTitle = driver.getTitle();
			if(ActualTitle.contains(expeTitle))
			{
				driver.close();
			}
		}

	}

}
