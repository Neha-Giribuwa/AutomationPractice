package multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demo.automationtesting.in/Register.html");
		 
		 List<WebElement> menuName = driver.findElements(By.cssSelector(".container>*:nth-child(2)>ul>li>a"));
		 
		 System.out.println("Count top Menu's : "+menuName.size());
		 
		 for(int i=0;i<menuName.size();i++) {
			 System.out.println("Top menu name: "+menuName.get(i).getText());
		 }

	}
}