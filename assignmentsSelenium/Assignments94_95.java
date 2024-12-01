package assignmentsSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignments94_95 {

	@BeforeSuite
	void testSuit() {
		System.out.println("before suit executed");
	}
	 @BeforeTest
	 void beforeTest() {
		 System.out.println("before test executed");
	 }
	 @BeforeClass
	 void beforeClass() {
		 System.out.println("before class executed");
	 }
	 @BeforeMethod
	 void beforeMethod(){
		 System.out.println("before method executed");
	 }
	 @Test
	 void test1() {
		 System.out.println("test 1 executed success");
	 }
	 @Test
	 void test2() {
		 System.out.println("test 2 executed success");
	 }
	 @Test
	 void test3() {
		 System.out.println("test 3 executed success");
	 }
	 @AfterMethod
	 void afterMethod() {
		 System.out.println("after method executed");
	 }
	 @AfterClass
	 void afterClass() {
		 System.out.println("after class executed");
	 }
	 @AfterTest
	 void afterTest() {
		 System.out.println("after test executed");
	 }
	 
	 @AfterSuite(enabled=false)
	 void afterSuit() {
			System.out.println("after suit executed");
		}
}

