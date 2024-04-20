package multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/cts1/login.do");
		//identify number link present in the page		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		
		System.out.println("Links count : "+linkList.size());
		
		for(int i=0;i<linkList.size();i++) {
//			WebElement element=linkList.get(i);
//			String hrefLink=element.getAttribute("href");
//			System.out.println("href: "+hrefLink);
					//or
			System.out.println("href: "+linkList.get(i).getAttribute("href"));
			
		}
	}

}