package AssignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments82 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement d1 = driver.findElement(By.id("Choice1"));
		
		Select s= new Select(d1);
		s.selectByVisibleText("Demo1");
		Thread.sleep(2000);
		driver.quit();
		
		EdgeDriver driver2 = new EdgeDriver();
		driver2.get("https://www.arraycom.co.in/solar-application-form/");
		driver2.manage().window().maximize();
		WebElement d2 = driver2.findElement(By.name("quform_3_26[1]"));
		Select s1= new Select(d2);
		s1.selectByVisibleText("Miss");
		
		EdgeDriver driver3 = new EdgeDriver();
		driver3.get("https://www.amazon.in/");
		driver3.manage().window().maximize();
		WebElement d3 = driver3.findElement(By.name("url"));
		Select s3= new Select(d3);
		s3.selectByVisibleText("Amazon Devices");
		
		d3.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
	}
}
