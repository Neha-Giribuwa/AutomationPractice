package switching;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import maventesting.SeleniumUtility;

public class BrokenLinkExample3{
	
	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver =util.setUp("chrome","https://demoqa.com/broken");
        //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());        
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
//            WebElement E1= links.get(i);
//            String url= E1.getAttribute("href");
//            verifyLinks(url);
        			//or
        	verifyLinks(links.get(i).getAttribute("href"));
        }        
        driver.quit();
    }
    
    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);
            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+"--response code is--> "+httpURLConnect.getResponseMessage()+"-- is a invalid/broken link");
            }           
            //Fetching and Printing the response code obtained
            else{
                System.out.println(linkUrl+"--response code is-->"+httpURLConnect.getResponseMessage()+ "-- Valid link");
            }
        }catch (Exception e) {
        	System.out.println("**********Link is not having href***********");
      }
   }
}