package testngDemo;

import org.testng.annotations.Test;

public class Example2 {
	@Test
	public void testCase1() {
		System.out.println("Hi, TC1");
	}
	@Test
	public void testCase3() {
		System.out.println("Hi, TC3");
	}
	@Test
	public void testCase2() {
		System.out.println("Hi, TC2");
		testCase4();
	}
	
	public void testCase4() {
		System.out.println("Hi, TC4");
	}
}
//test case executed as per alphabetical order
//here only execute method which have @Test so here only 3 test run present