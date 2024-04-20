package multipleElements;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment3 {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 List<WebElement> menuName = driver.findElements(By.cssSelector(".header-menu>.top-menu>li>a"));
	 
	 System.out.println("Count top Menu's : "+menuName.size());
	 
	 for(int i=0;i<menuName.size();i++) {
		 System.out.println("Top menu name: "+menuName.get(i).getText());
	 }

	}

}
