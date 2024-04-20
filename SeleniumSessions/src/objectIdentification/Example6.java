package objectIdentification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example6 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//implicit wait - will be used as default wait for WebDriver instance
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/tcs/login.do");//0-30sec
		
		driver.findElement(By.id("username")).sendKeys("admin01");//0-30sec
		
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30sec
		
		driver.findElement(By.id("loginButton")).click();//0-30sec
		
		//to get home page title, we need to use conditional wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));		
		//we can implement required wait condition
		wait.until(ExpectedConditions.titleIs("actiTIME - Licenses"));
		
		System.out.println("Home page title: "+driver.getTitle());
	}
}
/*
here script will be failed due to Sync issue.

Sync- Speed of automation tool is not matching with application

Sync
	1.implicit wait
	2.explicit wait (conditional wait)

*/