package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		//identify skill dropdown
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		//create an instance of Select class and pass identified dropdown object to its constructor
		Select carDrop=new Select(carDropdown);
		
		System.out.println("is car dropdown allows selecting multiple options? "+carDrop.isMultiple());
		
		
		List<WebElement> optionsList=carDrop.getOptions();
		System.out.println("Number of car available in Skill dropdown: "+optionsList.size());
		
		for(int i=0;i<optionsList.size();i++) {
			System.out.println(optionsList.get(i).getText());
		}
		
		//use any one method to select value from dropdown
		carDrop.selectByIndex(0);
		carDrop.selectByIndex(1);
		carDrop.selectByIndex(2);
		System.out.println("Totoal selected options: "+carDrop.getAllSelectedOptions().size());
		
		for(int i=0;i<carDrop.getAllSelectedOptions().size();i++) {
			System.out.println(carDrop.getAllSelectedOptions().get(i).getText());
		}
		
		//to unselect already selected option dn use any one method from below
		carDrop.deselectAll();
	}
}

