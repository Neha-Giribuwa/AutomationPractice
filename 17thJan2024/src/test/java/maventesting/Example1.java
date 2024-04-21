package maventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		util.typeRequiredText(driver.findElement(By.name("username")), "Admin");
		util.typeRequiredText(driver.findElement(By.name("password")), "admin123");
		util.clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
		String expectedUrl="dashboard";
		String actualUrl=util.getApplicationUrl();
		System.out.println("Url validation: "+actualUrl.contains(expectedUrl));
	}

}
/*
Scenario to Automate: 
Open chrome browser
Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Validate login page
Enter user name as Admin
Password as admin123
Click on login button
Validate home page

*/