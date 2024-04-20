package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Pune");
		
		driver.findElement(By.id("dest")).sendKeys("Goa");

	}

}


/* Open Redbus.in
From Pune
To Goa
Date in future
Click on search button
Departure time should be after 6am
Bus type “AC”
Get the bus name along with its price

for freezing screen
setTimeout(function(){debugger;}, 5000)
 */



