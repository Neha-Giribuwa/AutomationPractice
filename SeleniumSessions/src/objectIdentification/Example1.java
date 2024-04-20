package objectIdentification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		//open required browser
		WebDriver driver=new ChromeDriver();
		//enter application URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//identify username input field
		WebElement usernameInputFild=driver.findElement(By.id("username"));
		//delete existing text from username input field
		usernameInputFild.clear();
		//type username as admin
		usernameInputFild.sendKeys("admin");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.name("password"));
		//delete existing text from password input field
		passwordInputField.clear();
		//type password as admin
		passwordInputField.sendKeys("admin");
		
		//identify login button
		WebElement signInButton=driver.findElement(By.className("buttonBlue"));
		
		//click on login button
		signInButton.click();
	}
}
/*
 * Open browser
 * enter application URL
 * delete existing text from username input field
 * type username as admin
 * delete existing text from password input filed
 * type password as admin
 * click on signin button
 */
