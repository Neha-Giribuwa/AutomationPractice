package javasciptexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import maventesting.SeleniumUtility;

public class Sample2 {
	
	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver= util.setUp("Chrome", "https://www.google.com");
		util.takeScreenShotOfThePage("./screenshots/googleBeforeScreenshot.jpg");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		util.setSleep(1000);
		util.takeScreenShotOfThePage("./screenshots/googleAfterScreenshot.jpg");
	}

}
