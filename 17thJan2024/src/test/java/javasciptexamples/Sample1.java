package javasciptexamples;

import org.openqa.selenium.WebDriver;

import maventesting.SeleniumUtility;

public class Sample1 {

	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		WebDriver driver =util.setUp("Chrome","https://www.google.com");
		
//		// type WebDriver instance into TakeScreenshot
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		// now using TakesScreenshot interface get the screenshot
//		File screenshot = ts.getScreenshotAs(OutputType.FILE);
//		// after taking screenshot store it into required location
//		FileUtils.copyFile(screenshot, new File("./screenshots/google.jpg"));
		
		util.takeScreenShotOfThePage("./screenshots/google2.jpg");
	}
}
