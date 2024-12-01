package assignmentsSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Assignments100 {
	@BeforeSuite
	public void start() {
		System.out.println("after suit ");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method passed");
	}
	@Test
	public void test() {
		System.out.println("test passed");
	}
	@AfterSuite
	public void end() {
		System.out.println("before suit");
	}
}
