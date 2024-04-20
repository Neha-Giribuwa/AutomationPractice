package keyboardops;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.flipkart.com/");
        
        Actions action = new Actions(driver);//this actions object created for mouse performance
        
        List<WebElement> topMenuList= driver.findElements(By.cssSelector("._1ch8e_>div>div>*:nth-child(2)"));
	
        System.out.println("Elements present in Top menu: "+topMenuList.size());
        
        for(int i=0;i<topMenuList.size();i++) {
        	System.out.println("Menu name:"+topMenuList.get(i).getText());
        	
        	Thread.sleep(1000);
     		action.moveToElement(topMenuList.get(i)).perform();//mouse hover on element one by one
        }
	
	}

}
/*

TC1:
Open any browser and enter flipkart url
Get the top menu count 
One by one print top menu names and also perform mouse hover operations

*/
