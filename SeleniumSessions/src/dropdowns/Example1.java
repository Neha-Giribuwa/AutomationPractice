package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//identify skill dropdown
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		
		//create an instance of Select class and pass identified dropdown object to its constructor
		Select skillDrop=new Select(skillDropdown);
		
		System.out.println("is Skill dropdown allows selecting multiple options? "+skillDrop.isMultiple());
		
		System.out.println("By Default/already selected option: "+skillDrop.getFirstSelectedOption().getText());
		
		List<WebElement> optionsList=skillDrop.getOptions();
		System.out.println("Number of skills available in Skill dropdown: "+optionsList.size());
		
		for(int i=0;i<optionsList.size();i++) {
			System.out.println(optionsList.get(i).getText());
		}
		
		//use any one method to select value from dropdown
		skillDrop.selectByIndex(2);
		System.out.println("After selecting index 2 option: "+skillDrop.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		skillDrop.selectByValue("APIs");
		System.out.println("After selecting value as APIs: "+skillDrop.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		skillDrop.selectByVisibleText("Backup Management");
		System.out.println("After selecting visibletext as Backup Management: "+skillDrop.getFirstSelectedOption().getText());
		
	}
}
