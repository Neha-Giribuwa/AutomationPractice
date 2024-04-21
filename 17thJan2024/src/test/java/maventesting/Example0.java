package maventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example0 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=setUp("firefox", "https://jqueryui.com/droppable/");

		Actions action = new Actions(driver);		
		//to get inside the frame use below statement
		driver.switchTo().frame(0);		
		//to perform drag and drop first identify source and target
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));		
		//now perform drag and drop using Actions class
		action.dragAndDrop(src, target).build().perform();		
	}
	
	public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(appUrl);
		return driver;
	}
}
/*
 * Open actitime application enter user name as admin01 copy it and paste it
 * into password field press enter button to login
 */
