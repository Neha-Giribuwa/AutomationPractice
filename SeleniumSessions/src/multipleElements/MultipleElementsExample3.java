package multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:nth-child(1)>*:nth-child(1)>span"));
		
		System.out.println("Suggestion count : "+suggList.size());
		System.out.println("Suggestion count validation: "+(suggList.size()==10));
		
		for(int i=0;i<suggList.size();i++)
		{
			//to avoid staleElementException, re-identify your required element i.e suggList
			suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:nth-child(1)>*:nth-child(1)>span"));
			System.out.println(i+" Suggestion name: "+suggList.get(i).getText());
			System.out.println("\t\t\tSuggestion validation status: "+suggList.get(i).getText().contains("selenium"));
		}
		
	}
}
/*
 * open google and type selenium
 * check suggestion count is 10 or not
 * check each suggestion is having selenium or not
 */