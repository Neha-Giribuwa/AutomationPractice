package objectIdentification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		//open required browser
		WebDriver driver=new ChromeDriver();
		//enter application URL
		driver.get("https://www.saucedemo.com/");
		//identify username input field
		WebElement usernameInputFild=driver.findElement(By.id("user-name"));
		//type username as admin
		usernameInputFild.sendKeys("standard_user");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.id("password"));
		//type password as admin
		passwordInputField.sendKeys("secret_sauce");
		
		//identify login button
		WebElement signInButton=driver.findElement(By.id("login-button"));
		//click on login button
		signInButton.click();
	}
}
/*
 * Open browser
 * enter application URL
 * type username as standard_user
 * type password as secret_sauce
 * click on signin button
 */
