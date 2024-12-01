package Assignments112;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class retryTestcase {

	@Test(retryAnalyzer = seleniumTest.RetryLogic.class)
	public void test1() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		driver.findElement(By.name("eeeeeemail")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sakdhqoihjdqb");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}
}
