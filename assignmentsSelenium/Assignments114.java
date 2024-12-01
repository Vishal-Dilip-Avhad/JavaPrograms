package assignmentsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignments114 {

	WebDriver driver;

	@BeforeMethod
	public void OpenBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void testProductListOnAmazon() throws InterruptedException {

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
		List<WebElement> AllProducts = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		System.out.println(AllProducts.size());

		Assert.assertTrue(AllProducts.size() > 10, "The product list is empty");

	}

	@AfterMethod
	public void CLoseBrowser() {

		driver.quit();

	}
}
