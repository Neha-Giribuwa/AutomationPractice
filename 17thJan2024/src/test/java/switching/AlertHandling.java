package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import maventesting.SeleniumUtility;


public class AlertHandling {
	
	public static void main(String[] args) {
		
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

		driver.switchTo().frame("iframeResult");

		util.clickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));

		System.out.println("Alert msg : " + driver.switchTo().alert().getText());
		//to click on OK/Yes/Confirm button
		driver.switchTo().alert().accept();

	}
}