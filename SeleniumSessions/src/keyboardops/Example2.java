package keyboardops;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Register.html");

		Actions action = new Actions(driver);
		// menu list
		List<WebElement> menuList = driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//hover on particular element like webtable
		//action.moveToElement(menuList.get(2)).perform();
		
		//to hover on all menu items one by one
//      	for(int i=0;i<menuList.size();i++) {
//			Thread.sleep(1000);
//			action.moveToElement(menuList.get(i)).perform();
//	}
		
		//hover on SwitchTo using Webtable
		action.moveToElement(menuList.get(2),100,0).perform();//here we do slide next option with help of coordinates x and y
	}

}
/*
 * Open actitime application enter user name as admin01 copy it and paste it
 * into password field press enter button to login
 */