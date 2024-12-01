package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignments113 {

	WebDriver driver;

	@BeforeTest
	public void BrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}

	@BeforeClass
	public void SignIn() throws InterruptedException {
		WebElement signIn = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(signIn).perform();
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys("9922510362");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Vishal@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

		WebElement A1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(A1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign Out']")).click();
	}

	@Test(priority = 1)
	void VerifyLogOut1() throws InterruptedException {

		String t1 = driver.getTitle();
		System.out.println(t1);

		Assert.assertEquals(driver.getTitle(), "Amazon Sign In", " logout not successfull");
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	void VerifyLogout2() {
		boolean d1 = driver.findElement(By.xpath("//input[@id='continue']")).isDisplayed();
		Assert.assertEquals(d1, true);

	}

	@Test(priority = 3)
	void VerfyLogout3() {
		boolean e1 = driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).isEnabled();
		Assert.assertEquals(e1, true);
	}

	@AfterTest
	public void BrowserQuit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
