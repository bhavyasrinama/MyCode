package New.PopUps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//span[text()='Later']")).click();;
		Thread.sleep(8000);
		 //we can directly give full path(absolute) at button itself without creating file and converting
		//driver.findElement(By.xpath("//label[contains(text(),'Upload CV')]")).sendKeys("H:\\3Y_Exp_QA_SaiBhavyaSri");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("bhavyasri.nama@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("94409564");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='bhavya']")).click();
		Thread.sleep(8000);
		File f = new File("./data/3Y_Exp_QA_SaiBhavyaSri.docx");//it is a relative path
		String abspath= f.getAbsolutePath();// it converts to  absolute path
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(abspath);//else we can pass directlyabs pth in sendkeys

		
	}
}