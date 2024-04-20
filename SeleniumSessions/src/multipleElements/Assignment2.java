package multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		List<WebElement> deviceList= driver.findElements(By.cssSelector("#body>div>*:nth-child(2)>div>ul>li>a>strong"));
		
		System.out.println("Device count: "+deviceList.size());
		
		for(int i=0;i<deviceList.size();i++) {
			WebElement element=deviceList.get(i);
			String devicename=element.getText();//text return type string here
			System.out.println("Device name: "+devicename);
			           // OR
//			System.out.println("device name: "+deviceList.get(i).getText());
		}
	}
}


/*
TC2: 
	https://www.gsmarena.com/samsung-phones-9.php
	print all device count and name
*/