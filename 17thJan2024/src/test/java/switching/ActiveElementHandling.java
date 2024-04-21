package switching;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import maventesting.SeleniumUtility;

public class ActiveElementHandling {

	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://online.actitime.com/cts1/login.do");
		/*
		 * validate mouse pointer is present in username input field
				or
			validate focus is on username input field
		 */
		WebElement element=driver.switchTo().activeElement();
		
		String activeElementPlaceholder=util.getRequiredAtrributeValue(element, "placeholder");
		System.out.println("is focus on Username input field? "+activeElementPlaceholder.equals("Username"));
		
		element.sendKeys("admin01",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin01",Keys.ENTER);
	}
}
/*
validate mouse pointer is present in username input field
	or
validate focus is on username input field

login into application without identifying any element

*/

	