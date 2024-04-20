package dropdowns;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
        WebElement yearDropdown=driver.findElement(By.id("yearbox"));
        
		//create an instance of Select class and pass identified dropdown object to its constructor
		Select yearDrop=new Select(yearDropdown);
		
		
		System.out.println("Is year dropdown allows selecting multiple options? "+yearDrop.isMultiple());
	}
}
		/*		
		List<Integer> optionsList=new Arraylist<Integer>();
		for(int i=1; i<yearDrop.getOptions().size();i++);
		
	//  optionsList.add(Integer.parseInt(yearDrop.getOptions().get(i).getText()));
	              //or
		WebElement  element = yearDrop.getOptions().get(i);
		//get the value from WebElement in the form of string
		String yr= element.getText();
		//convert the string into number
		int year =Integer .parseInt(yr);
		//add the year in list
		optionsList.add(year);
	}
}
		List<Integer> clonedYearList= new Arraylist<Integer>(optionsList);
		//sorting clonedYearList
		Collections.sort(clonedYearList);

		System.out.println("is year in sorting order? "+optionsList.equals(clonedYearList));
	
	}
}

/*
 * validate year and month dropdown
 * 		- check multiple selection
 * 		- check whether your allowed to select any option or not
 * 		- validate year is in ascending order or not
 * 		- validate months option are in required sequence
 */