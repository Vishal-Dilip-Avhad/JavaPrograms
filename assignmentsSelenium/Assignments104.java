package assignmentsSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignments104 {
	@AfterMethod
	public void aaa() {
		System.out.println("after method passed");
	}
	@Test
	public void test2() {
		System.out.println("test2 passed");
	}
	@Test
	public void test1() {
		System.out.println("test1 passed");
	}
	@BeforeMethod
	public void zzz() {
		System.out.println("before method passed");
	}
}
