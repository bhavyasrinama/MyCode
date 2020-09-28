package selenium.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//declare elements
	@FindBy(id="username")
	WebElement untb;
	
	@FindBy(name="pwd")
	WebElement pwdtb;
	
	@FindBy(xpath="//div[text()='Login ]")
	WebElement loginbtn;
	
	//initialise
	Login(WebDriver driver)
	{
	 PageFactory.initElements(driver, this);	
	}
	//utilise
	 
	public void setUsername(String un)
	{
		untb.sendKeys(un);
		
	}
	
	public void setPassword(String pswd)
	{
		pwdtb.sendKeys(pswd);
	}
	public void clickLogin()
	{
	loginbtn.click();
	
	}
	public static void main(String[] args) {
		WebDriver driver = null;
		Login li=new Login(driver);
		li.setUsername("bhavya");
		
	}

}
