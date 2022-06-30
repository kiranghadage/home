package POM;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	@FindBy(xpath="//button[@class='button-blue buy']")private WebElement buy;
	@FindBy(xpath="//span[@class='tradingsymbol']")private List<WebElement> listofsearch;
	
	
	public ZerodhaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void entersearch(String s)
	{
		search.sendKeys(s);
	}
//	public void enterbuy()
//	{
//	buy.click();
//	}
   public void clickby(WebDriver driver,String name)
   {
	   int num=listofsearch.size();
	   for(int i=0;i<num-1;i++)
	   {
		   WebElement stock=listofsearch.get(i);
		   if(stock.getText().equals(name))
		   {
			    Actions action =new Actions(driver);
		    	action.moveToElement(stock).perform();
		    	
		   }
		   buy.click();
	   }
   	  
    	
//    
//   
//   	    	
//   	
//    }
}
}