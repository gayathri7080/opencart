package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAdress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPwd;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmail(String email) 
	{
		txtEmailAdress.sendKeys(email);;
	}
	
	public void setPwd(String pwd) 
	{
		txtPwd.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
}
