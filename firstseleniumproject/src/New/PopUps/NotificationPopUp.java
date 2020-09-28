package New.PopUps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {
	
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws Throwable {
		
		// specific to each browser, options classes are present, firefoxOptions, ieOptions, .. etc
		ChromeOptions opts= new ChromeOptions();
		opts.addArguments("--disable-notifications");
		opts.addArguments("--start-maximized");
		opts.addArguments("--incognito");
		
		
	
		WebDriver driver= new ChromeDriver(opts);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		//driver.get("//https:web-push-book.gauntface.com/demos/notification-examples");
		

}
} 
