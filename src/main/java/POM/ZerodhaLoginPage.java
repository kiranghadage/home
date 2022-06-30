package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
	
	public ZerodhaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enteruserid(String uid)
	{
		userid.sendKeys(uid);
	}
	
	public void enterpass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnlogin()
	{
		login.click();
	}
	
	public void clickOnforgot()
	{
		forgot.click();
	}
	
	public void clickOnsignup()
	{
		signup.click();
	}
}
