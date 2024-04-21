package testngDemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.SeleniumUtility1;

public class Assignment01 extends SeleniumUtility1 {

	@Test
	public void sourceDemoShopping() throws InterruptedException {
		setUp("Chrome","https://www.saucedemo.com/");
		typeInput(driver.findElement(By.name("user-name")),"standard_user");
		typeInput(driver.findElement(By.name("password")),"secret_sauce");
		clickOnElement(driver.findElement(By.id("login-button")));
		clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));
		clickOnElement(driver.findElement(By.className("shopping_cart_container")));
		clickOnElement(driver.findElement(By.id("checkout")));
		Thread.sleep(1000);
		typeInput(driver.findElement(By.id("first-name")),"Neha");
		typeInput(driver.findElement(By.id("last-name")),"Giri");
		typeInput(driver.findElement(By.id("postal-code")),"4512");
		clickOnElement(driver.findElement(By.id("continue")));
		clickOnElement(driver.findElement(By.id("finish")));
		Thread.sleep(1000);
	    clickOnElement(driver.findElement(By.id("back-to-products")));
	}
	
	
	@Test
	public void orangeHRM_PIMCreation() throws InterruptedException {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")), "Admin");
		typeInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
		typeInput(driver.findElement(By.name("firstName")), "Neha");
		typeInput(driver.findElement(By.name("lastName")), "Giri");
		// employee id
		typeInput(driver.findElement(By.cssSelector(".orangehrm-employee-form>div>:nth-child(2)>div>div>:nth-child(2)>input")),"13");
		// click on save
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-card-container>:nth-child(3)>:nth-child(3)>*:nth-child(3)")));
		Thread.sleep(1000);
	}
	
	@Test
	public void orangeHRM_PIMUpdate() throws InterruptedException {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")), "Admin");
		typeInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		
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
	
	@Test
	public void orangeHRM_PIMDelete() {
		
	}

}