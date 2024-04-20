package browserops;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignmentno3 {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			WebElement usernameInputField=driver.findElement(By.name("username"));
			
			WebElement passwordInputField=driver.findElement(By.name("password"));
			
			usernameInputField.sendKeys("Admin");//0-30sec
			
			passwordInputField.sendKeys("admin123");//0-30sec
			
			driver.findElement(By.className("orangehrm-login-button")).click();//0-30sec
			
			
		}

	}
/*
    https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

	get the username and password from the application and store it into a variable

	enter username 
	enter password
	click on login button
*/