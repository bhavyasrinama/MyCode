package window;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWind {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}


	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/popuptest1.html");
		// if u want to close only parent window then only driver.close() is req
		//driver.close();
		String parent= driver.getWindowHandle();
		Set<String> allWin =driver.getWindowHandles();
		System.out.println(allWin.size());
		for(String win:allWin){
			driver.switchTo().window(win); 
			if(!(win.equals(parent))){
				driver.close();
			}
		}
			
		}
}
