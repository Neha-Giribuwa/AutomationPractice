package browserops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		
		//identify username and password from the application and store it into a variable
		String userNames=driver.findElement(By.id("login_credentials")).getText();
		System.out.println("Usernames: "+userNames);
		String[] nameList=userNames.split("\n");
		
		
		String passwordNames=driver.findElement(By.className("login_password")).getText();
		System.out.println("Password names: "+passwordNames);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
		driver.findElement(By.id("login-button")).click(); 	
	}

}
/*
https://www.saucedemo.com/

get the username and password from the application and store it into a variable

enter username 
enter password
click on login button
*/