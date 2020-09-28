 package New.PopUps; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthnticationPopup {

	
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//************as we cant inspect the popup, so providing credentials at url itsef****************//
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
