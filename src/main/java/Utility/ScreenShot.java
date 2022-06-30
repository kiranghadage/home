package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

import POJO.Main;




public class ScreenShot {
	public static void takeScreenShot(WebDriver driver,String name) throws IOException {
		
		String d=ScreenShot.date();
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("F:\\automation\\screenshot\\"+name + d+".jpeg");
	     FileHandler.copy(source, destination);
	    
	}
	
	public static String date()
	{
		DateTimeFormatter drf=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");//format  the time date and time as required
		LocalDateTime currentTime=LocalDateTime.now();//return current date
		String d=drf.format(currentTime);//format the time given By now() method  to required format and return string
		return d;
		
	}

	

}
