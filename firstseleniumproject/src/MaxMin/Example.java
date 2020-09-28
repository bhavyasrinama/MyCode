package MaxMin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	
	 
	 public static void main (String [] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium Environment\\Drivers\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Thread.sleep(5000);
	 driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	 // find the SoftwareTestingMaterial logo using linkText Locator
	 WebElement logo = driver.findElement(By.linkText("Software Testing Material"));
	                //To get the width of the logo
	         int logoWidth = logo.getSize().getWidth();
	         System.out.println("Logo width : "+logoWidth+" pixels");
	                //To get the height of the logo
	         int logoHeight = logo.getSize().getHeight();        
	         System.out.println("Logo height : "+logoHeight+" pixels");
	 } 
	}

