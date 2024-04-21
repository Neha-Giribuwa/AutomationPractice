package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SuiteCondition {
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("****************beforeSuite***********************");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("****************afterSuite***********************");
  }

}