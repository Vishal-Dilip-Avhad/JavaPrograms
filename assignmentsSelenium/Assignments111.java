package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignments111 {

	@DataProvider(name="data1")
	public Object[][] method1(){
		
		return new Object[][]  {{"shoes"},{"iphone"},{"mouse"},{"soundbar"},{"notebook"},{"pen"},{"colgate"},{"bluetooth"},{"keyboard"},{"mouse"}};
	}
	
	@Test(dataProvider="data1")
	public  void amazonSearch(String input) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
}
