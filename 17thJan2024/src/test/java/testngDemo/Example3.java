package testngDemo;

import org.testng.annotations.Test;

public class Example3 {

	@Test(priority=2,enabled=true)
	public void testCase1() {
		System.out.println("Hi, TC1");
	}
	@Test(priority=1,enabled=false)
	public void testCase3() {
		System.out.println("Hi, TC3");
	}
	@Test(priority=3,enabled=true)
	public void testCase2() {
		System.out.println("Hi, TC2");
	}
	@Test(enabled=true)
	public void testCase4() {
		System.out.println("Hi, TC4");
	}

}
/* by default method priority is 0
 so we proivde priority here so it will run as per priority 
here enabled=false means we dont want to execute the method this time
enabled=true means we dont want to execute the method this time*/
