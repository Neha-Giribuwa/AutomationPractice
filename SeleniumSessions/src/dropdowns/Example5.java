package dropdowns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\TestData\\AppData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("appUrl"));//0-30sec
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));//0-30sec
		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));//0-30sec
		
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30sec
		
		System.out.println(driver.getCurrentUrl().contains(prop.getProperty("expectedUrl")));
	}
}
/*
here script will be failed due to Sync issue.

Sync- Speed of automation tool is not matching with application

Sync
	1.implicit wait
	2.explicit wait (conditional wait)

*/