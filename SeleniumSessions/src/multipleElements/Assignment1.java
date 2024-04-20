package multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		
        List<WebElement> deviceList=driver.findElements(By.cssSelector("#body>aside>div>ul>li"));
		
		System.out.println("Device count : "+deviceList.size());
		
		for(int i=0;i<deviceList.size();i++) {
//			WebElement element=deviceList.get(i);
//			String deviceName=element.getText();
//			System.out.println("device name: "+deviceName);
					//or
			System.out.println("device name: "+deviceList.get(i).getText());
			
		}
	}
}
/*
TC1:
	https://www.gsmarena.com/
	print mobile brand count and names
*/