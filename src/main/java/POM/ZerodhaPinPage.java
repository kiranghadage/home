package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	
	@FindBy(tagName="input")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement Forgot;
	@FindBy(xpath="//a[text()='Don't have an account? Signup now!']")private WebElement signup;
	
	public ZerodhaPinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Enterpin(String pinno)
	{
		pin.sendKeys(pinno);
	}
	
	public void Clickonsubmit()
	{
		submit.click();
	}
	
	public void Clickonforgot()
	{
		Forgot.click();
	}
	
	public void Clickonsignup()
	{
		signup.click();
	}

}
