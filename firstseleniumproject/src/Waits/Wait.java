package Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
	
	
	static{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	}
	
	
		public static void main(String[] args) throws InterruptedException {									
	        	WebDriver driver=new ChromeDriver();			
	        		
	        //Launching the site.				
	            driver.get("http://fb.com");			
	        driver.manage().window().maximize();
	        
	        //static wait
	        Thread.sleep(1000);
	        
	   
	        
	        
	        
	                	

}
}
