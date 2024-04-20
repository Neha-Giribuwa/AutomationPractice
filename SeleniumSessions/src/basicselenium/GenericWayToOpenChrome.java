package basicselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
 
public class GenericWayToOpenChrome {
	
	public static void main(String[] args) {
		 // create an instance of required browser class
		 WebDriver driver= new ChromeDriver();
		 
		 //enter requires application title
		 driver.get("https://www.google.com");
   
		 //get application title
		 String actualTitle= driver.getTitle();
		 String expectedTitle="Google";
		 
		 System.out.println("Number of character in application title: "+actualTitle.length());
	     System.out.println("Is google page opened? "+actualTitle.equals(expectedTitle));
	
	     //get current url from browser
	     System.out.println("Current url of application: "+driver.getCurrentUrl());
	
	     //get application source code
	     String pageSource= driver.getPageSource();
	     System.out.println("Char in page source: "+pageSource.length());
	
	     // close current browser
	     driver.close();
	
	}

}
