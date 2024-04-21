package maventesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {
	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait wait;

	public WebDriver setUp(String browserName, String appUrl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get(appUrl);
		action = new Actions(driver);
		return driver;
	}

	public void waitForElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public String getPageTitle(String title) {
		if (!title.isEmpty()) {
			wait.until(ExpectedConditions.titleIs(title));
			return driver.getTitle();
		} else {
			return driver.getTitle();
		}
	}
	
	public String getAttributeValue(WebElement element, String attributeName) {
		waitForElement(element);
		return element.getAttribute(attributeName);
	}
	
	public String getCSSAttributeValue(WebElement element, String attributeName) {
		waitForElement(element);
		return element.getCssValue(attributeName);
	}
	
	public String getTextFromElement(WebElement element) {
		waitForElement(element);
		return element.getText();
	}
	
	public void typeRequiredText(WebElement element, String input) {
		waitForElement(element);
		element.clear();
		element.sendKeys(input);
	}
	
	public void clickOnElement(WebElement element) {
		waitForElement(element);
		element.click();
	}
	
	public void performHoverOps(WebElement element) {
		waitForElement(element);
		action.moveToElement(element).perform();
	}
	
	public void performDragAndDrop(WebElement element1,WebElement element2) {
		action.dragAndDrop(element1, element2).build().perform();
	}
	
	public String getApplicationUrl() {
		
		return driver.getCurrentUrl();
	}
	
	public void setSleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void takeScreenShotOfThePage(String location) {
		//downcast the driver to access TakeScreenshot method
		TakesScreenshot ts= (TakesScreenshot) driver;
		//capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			//save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getRequiredAtrributeValue(WebElement element, String attribute) {
		waitForElementDisplayed(element);
		setSleepTime(2000);
		return element.getAttribute(attribute);
	}

	private void setSleepTime(int i) {
		// TODO Auto-generated method stub
		
	}

	private void waitForElementDisplayed(WebElement element) {
		// TODO Auto-generated method stub
		
	}
}