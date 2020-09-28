package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	//mngr252491/erUqYte
	
	@FindBy (xpath="//table//tr[@class='heading3']")
	public WebElement LoginID;
	
	public  HomePage( WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public String getUserName(){
		return LoginID.getText();
	}
}
