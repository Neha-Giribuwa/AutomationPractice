package objectIdentification;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Assignment01 {

	public static void main(String[] args) {
		
	WebDriver driver= new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	String actualTitle=driver.getTitle();
	System.out.println("Title of page: "+actualTitle);
	System.out.println("Number of elements present in title: "+actualTitle.length());
	
	System.out.println("Current url of application: "+driver.getCurrentUrl());
	
	driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
	
	driver.findElement(By.id("Password")).sendKeys("Abc@12345");
	
	driver.findElement(By.className("login-button")).click();
	
	Wait<WebDriver>wait =new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(30))
	.pollingEvery(Duration.ofSeconds(5))
	.ignoring(NoSuchElementException.class);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
	driver.findElement(By.id("logoutLink")).click();
	
	}

}
/*
Scenario to Automate:
Launch a new firefox browser.
Open https://demowebshop.tricentis.com/login
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter username as “tester01@vomoto.com”
Enter password as “Abc@12345”
Click on login button
Get the page title and current URL, print on console
Click on logout
Close the Browser.
*/
