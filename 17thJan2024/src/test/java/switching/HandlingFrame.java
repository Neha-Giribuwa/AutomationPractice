package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import maventesting.SeleniumUtility;
import utility.SeleniumUtil;

public class HandlingFrame{
	
	public static void main(String[] args) {
		
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://jqueryui.com/");
		
		util.clickOnElement(driver.findElement(By.xpath("//a[text()='Selectable']")));//click on selectable
		//move control inside the frame to perform required opr on the element
//		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);		
				//or
		driver.switchTo().frame(0);//here we use index 0 bcoz in iframe its only 1 iframe present in that page 
		
		util.clickOnElement(driver.findElement(By.xpath("//li[text()='Item 2']")));//select item 2
		
		//to get the control back to main page use
		driver.switchTo().defaultContent();
		util.clickOnElement(driver.findElement(By.cssSelector(".logo")));//click on site logo	
	}
}

/*
open https://jqueryui.com/
click on Selectable
select any item
click on site logo
*/