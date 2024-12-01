package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignments110 {

	@DataProvider(name="data1")
	public Object[][] method1(){
		
		return new Object[][]  {
			{"9922510362", "Vishal@123","shoes"},
			{"9922510362", "Vishal@123","iphone"},
			{"9922510362", "Vishal@123","mouse"},
			{"9922510362", "Vishal@123","soundbar"},
			{"9922510362", "Vishal@123","powerbank"},
			{"9922510362", "Vishal@123","wallet"},
			{"9922510362", "Vishal@123","watch"},
			{"9922510362", "Vishal@123","denim shirts"},
			{"9922510362", "Vishal@123","cookies"},
		
			};
	}
	
	@Test(dataProvider="data1")
	public  void amazonSearch(String username,String pwd, String values) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement signIn = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(signIn).perform();
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(values);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
}
