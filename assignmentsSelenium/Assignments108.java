package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignments108 {

	@DataProvider(name="data2")
	public Object[][] Method1(){
		
       return new Object[][] {
    	   
    	   {"pune"},{"mumbai"},{"banglore"}
       };
	}
	
	@Test(dataProvider = "data2")
	public void GoogleSearch(String input) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		e1.sendKeys(input+Keys.ENTER);
	}
}
