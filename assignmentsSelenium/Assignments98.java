package assignmentsSelenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignments98 {

	@AfterSuite
	public void start() {
		System.out.println("after suit ");
	}
	@Test
	public void test1() {
		System.out.println("test1 passed");
	}
	@Test
	public void test2() {
		System.out.println("test2 passed");
	}
	@BeforeSuite
	public void end() {
		System.out.println("before suit");
	}
}
