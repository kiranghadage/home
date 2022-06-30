package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Main;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

@Listeners(TestListeners.class)
public class PinPageTest extends BaseTest {
	
	
	
	@BeforeMethod
	public void test2()
	{
		driver=Main.openBrowser();
	}
	
	@Test
	public void EnterPin() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userName=Parametrization.test(0, 1);
		String pasword=Parametrization.test(1, 1);
		zerodhaLoginPage.enteruserid(userName);
		zerodhaLoginPage.enterpass(pasword);
		zerodhaLoginPage.clickOnlogin();
		
	
	   Thread.sleep(2000);
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
	     String pin=Parametrization.test(4,1);
	     zerodhaPinPage.Enterpin(pin);
		 zerodhaPinPage.Clickonsubmit();
		
		
//		Thread.sleep(3000);
//		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
		//String text=Parametrization.test(3,1);
	  // zerodhaHomePage.entersearch(text);
//	   zerodhaHomePage.enterbuy();
		//zerodhaHomePage.clickby(driver);
//		zerodhaHomePage.entersearch("TATACOFFEE");
//		zerodhaHomePage.clickby(driver,"TATACOFFEE");
		
		

}
	

	
   @Test
   public void home()
   {
	   System.out.println("Hello i am kiran");
   }
}