package browserops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username input field validation
		WebElement userNameInputField=driver.findElement(By.name("username"));
		System.out.println("Username input field, visible or not? "+userNameInputField.isDisplayed());
		System.out.println("Username input field, editable or not? "+userNameInputField.isEnabled());
		System.out.println("Username input field, default text displayed: "+userNameInputField.getAttribute("name"));

		//password input field validation
		WebElement passwordInputField=driver.findElement(By.name("password"));
		System.out.println("Password input field, visible or not? "+passwordInputField.isDisplayed());
		System.out.println("Password input field, editable or not? "+passwordInputField.isEnabled());
		System.out.println("Password input field, default text displayed: "+passwordInputField.getAttribute("name"));
		

		//login button validation
		WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("loginButton, visible or not? "+loginButton.isDisplayed());
		System.out.println("loginButton, clickable or not? "+loginButton.isEnabled());
		System.out.println("loginButton, button name: "+loginButton.getText());
		
		//forgot your password
		WebElement forgotYourPassword= driver.findElement(By.className("orangehrm-login-forgot-header"));
		System.out.println("forgot your password, visible or not?: "+forgotYourPassword.isDisplayed());
		System.out.println("forgot your password, clickable or not?: "+forgotYourPassword.isEnabled());
		System.out.println("forgot your password, default text name:"+forgotYourPassword.getText());
	}
}
	
	/*
	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	Admin/admin123

	validation:
		Username:
		visible or not --->
		editable or not--->
		default value--->
		
		password:
		visible or not --->
		editable or not--->
		default value--->

	Login button:
		visible or not--->
		clickable or not--->
		button name--->

	Forgot your password?
		visible or not--->
		clickable or not--->
		link name--->

	*/