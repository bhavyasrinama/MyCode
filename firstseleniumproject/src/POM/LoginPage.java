package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//object repository

	/*@FindBy(id="username")
	private WebElement TxtBox;  

	@FindBy(id="pwd")
	private WebElement pswd;

	@FindBy(id="loginButton")
	private WebElement loginBtn;*/

	WebDriver driver;

	@FindBy(name="uid")
	private WebElement UserID;

	@FindBy(name="password")
	private  WebElement password;

	@FindBy(className="barone")
	private  WebElement titleText;

	@FindBy(name="btnLogin")
	private WebElement LoginBtn;

	@FindBy(name="btnReset")
	private WebElement ResetBtn;

	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		// this initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

	// Set username in textbox

	public void setUsernm(String Username)
	{
		UserID.sendKeys(Username);
	}

	public void setPswd(String passwrd)
	{
		password.sendKeys(passwrd);
	}

	public void clickLogin()
	{
		LoginBtn.click();
	}

	public void clickResetbtn()
	{
		ResetBtn.click();
	}

	public String getTitle()
	{
		return titleText.getText();
	}

	public void logInPage(String Username, String passwrd)
	{
		this.setUsernm(Username);
		setPswd(passwrd);
		clickLogin();
	}
}
