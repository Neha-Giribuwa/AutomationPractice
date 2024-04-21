package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.SeleniumUtility1;

public class AssignOrangeHrm_PIM extends SeleniumUtility1 {
	@BeforeTest
	public void openBrowserAndEnterUrl() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeMethod
	public void loginAndNavigateToPIMHomePage() {

		typeInput(driver.findElement(By.name("username")), "Admin");
		typeInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
	}

	@Test(priority = 1)
	public void testPIM_Creation() throws InterruptedException {

		clickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
		typeInput(driver.findElement(By.name("firstName")), "Neha");
		typeInput(driver.findElement(By.name("lastName")), "Giri");
		// employee id
		typeInput(driver.findElement(By.cssSelector(".orangehrm-employee-form>div>:nth-child(2)>div>div>:nth-child(2)>input")),"13");
		// click on save
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-card-container>:nth-child(3)>:nth-child(3)>*:nth-child(3)")));
		Thread.sleep(1000);
	}

	@Test(priority = 2, dependsOnMethods = "testPIM_Creation")
	public void testPIM_Update() throws InterruptedException {
		// click on pim
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		String expectedUrl = "pim";
		Assert.assertTrue(getCurrentUrlOfApplication().contains(expectedUrl));
		// click on employee list
		clickOnElement(driver.findElement(By.xpath("//a[text()='Employee List']")));

		driver.findElement(By.xpath("//label[text()='Employee Id']"));
		// employee id
		typeInput(driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input")),"039413");
		
		// search button
		clickOnElement(driver.findElement(By.cssSelector(".oxd-form>*:nth-child(3)>*:nth-child(2)")));
		Thread.sleep(1000);
		
	}

	@AfterMethod
	public void logout() {
		clickOnElement(driver.findElement(By.cssSelector(".oxd-userdropdown")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
	}

}