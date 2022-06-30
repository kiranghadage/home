package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Main;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;

public class LoginpageTest {
	
	WebDriver driver;//global
	
	
	@BeforeMethod
	public void test1()	{
	driver=Main.openBrowser();	
	}
	
	@Test
	public void LoginWithVaildCredentialsTest() throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userName=Parametrization.test(0, 1);
		String pasword=Parametrization.test(1, 1);
		zerodhaLoginPage.enteruserid(userName);
		zerodhaLoginPage.enterpass(pasword);
		zerodhaLoginPage.clickOnlogin();
	}
	@Test
	public void forgotpasswordlinktest()
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnforgot();
	}
	
	@Test
	public void signuplinktest()
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnsignup();
	}
	
	

}