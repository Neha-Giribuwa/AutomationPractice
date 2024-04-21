package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import maventesting.SeleniumUtility;

public class Assignment2 {

	public static void main(String[] args) {
		SeleniumUtility util =new SeleniumUtility();
		WebDriver driver= util.setUp("Chrome", "https://jqueryui.com");
		
		util.clickOnElement(driver.findElement(By.xpath("//a[text()='Sortable']")));
		
		WebElement src=driver.findElement(By.className("ui-sortable-handle"));
	}

}
		/* for(int i=0;i<src.length;i++) {
			System.out.print(src[i]+" ");
			
		action.dragAndDrop(src, target).build().perform();
	
}

/*
TC1:
Open browser and enter URL as https://jqueryui.com 
click on sortable 
 sort the element from 7 to 1
*/