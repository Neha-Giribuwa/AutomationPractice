package keyboardops;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/droppable/");

		Actions action = new Actions(driver);
		
		//to get inside the frame use below statement
		driver.switchTo().frame(0);
		
		//to perform drag and drop first identify source and target
		WebElement src=driver.findElement(By.id("draggable"));//drag folder 
		WebElement target=driver.findElement(By.id("droppable"));//drop folder
		
		//now perform drag and drop using Actions class
		action.dragAndDrop(src, target).build().perform();
		
	}

}
/*
 * Open actitime application enter user name as admin01 copy it and paste it
 * into password field press enter button to login
 */