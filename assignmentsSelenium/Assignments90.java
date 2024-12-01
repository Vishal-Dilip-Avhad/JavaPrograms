package assignmentsSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments90 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//span[.='Sign in with Google']")).click();
		
		Set<String> e2 = driver.getWindowHandles();
		System.out.println(e2);
		
	    Iterator<String> e3 = e2.iterator();
	    String parent = e3.next();
	    String child = e3.next();
	    
	    driver.switchTo().window(child);
	    boolean e4 = driver.findElement(By.xpath("//input[@type='email']")).isEnabled();
	    System.out.println(e4);
	    driver.switchTo().window(parent);
	    
	}
}
