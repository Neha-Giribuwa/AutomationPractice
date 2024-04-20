package objectIdentification;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://online.actitime.com/tcs/login.do");
		
		String actualTitle= driver.getTitle();
		
		System.out.println("Title of page: "+actualTitle);
		System.out.println("Number of character in application title: "+actualTitle.length());
		
		WebElement usernameInputFild=driver.findElement(By.id("username"));
		
		usernameInputFild.sendKeys("admin01");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		
		passwordInputField.sendKeys("admin01");
		
		WebElement getLoginButton=driver.findElement(By.id("loginButton"));
		
		getLoginButton.click();

	}

}
/*
Launch a new Chrome browser.
Open https://online.actitime.com/tcs/login.do
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter valid username and password (admin01/admin01)
Click on login button
Print the title on the console
Close the Browser.
*/