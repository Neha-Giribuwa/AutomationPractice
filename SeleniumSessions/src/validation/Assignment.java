package validation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.opencart.com/index.php?route=account/login");
		
		driver.findElement(By.className("btn-primary")).click();
		
		WebElement loginButton =driver.findElement(By.className("btn-primary"));
		//text color
		String loginButtonTextColor= loginButton.getCssValue("color");//stored in string variable
		System.out.println("Login button text color; "+loginButton.getCssValue("color"));//print the value
		//background color
		System.out.println("Background color of login button: "+loginButton.getCssValue("background-color"));
		//font size
		System.out.println("font size of login button: "+loginButton.getCssValue("font-size"));
	    //font family
		System.out.println("font family of login button: "+loginButton.getCssValue("font-family"));
	
		Point loginPoint= loginButton.getLocation();
		int login_X= loginPoint.getX();
	    int login_Y= loginPoint.getY();
	    System.out.println("login button is on X co-ordinates: "+login_X);
	    System.out.println("login button is on Y co-ordinates: "+login_Y);
		
		
		WebElement errorMsg =driver.findElement(By.className("alert-danger"));
		Point errorPoint= errorMsg.getLocation();
		int error_X= errorPoint.getX();
	    int error_Y= errorPoint.getY();
	    System.out.println("Error message is on X co-ordinates: "+error_X);
	    System.out.println("Error message is on Y co-ordinates: "+error_Y);
	    
	    System.out.println("Is email msg diplayed above login header? "+(error_Y<login_Y));
	
	}
}

/*
https://www.opencart.com/index.php?route=account/login

validate error msg is above Login header 

button:
	text color
	background color
	font size
	font-family
*/