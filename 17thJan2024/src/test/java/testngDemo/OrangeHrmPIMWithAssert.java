package testngDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import maventesting.SeleniumUtility;



public class OrangeHrmPIMWithAssert extends SeleniumUtility {

	@Test(priority=2)
	public void testOrangeHrmLogin_PositiveFlow() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeRequiredText(driver.findElement(By.name("username")),"Admin");
		typeRequiredText(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		String expectedUrl="dashboard";
		//System.out.println("Positive login validation: "+getCurrentUrlOfApplication().contains(expectedUrl));
		Assert.assertTrue(getApplicationUrl().contains(expectedUrl));
		driver.close();
	}
	@Test(priority=1)
	public void testOrangeHrmLogin_NegativeFlow() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeRequiredText(driver.findElement(By.name("username")),"Admin");
		typeRequiredText(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		String expectedUrl="login";
		//System.out.println("Negative login validation: "+getCurrentUrlOfApplication().contains(expectedUrl));
		Assert.assertTrue(getApplicationUrl().contains(expectedUrl));
		driver.close();
	}
}