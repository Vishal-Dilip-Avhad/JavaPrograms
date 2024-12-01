package assignmentsSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignments102 {

	
	@Test
	public void test1() {
		System.out.println("test1 passed");
	}
	@BeforeMethod
	public void start() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void end() {
		System.out.println("after method");
	}
	@Test
	public void test2() {
		System.out.println("test2 passed");
	}
}
