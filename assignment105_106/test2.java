package assignment105_106;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//WAP using TestNG annotations to launch browser ,add product to cart and log out use> BeforeMethod , Test , After Method.
import org.testng.annotations.Test;

public class test2 extends LaunchandQuit {
	@Test	
	public void LoginSearchingAddtoCart() throws InterruptedException {
			
		System.out.println("SearchingAddtoCart....");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		
		
		 WebElement e1 = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		 e1.click();
			
		 Set<String> e2 = driver.getWindowHandles();
		 System.out.println(e2);
		 
		 Iterator<String> e3 = e2.iterator();
		 String parent = e3.next();
		 String child = e3.next();
		 
		 driver.switchTo().window(child);
		 driver.findElement(By.id("add-to-cart-button")).click();
		 Thread.sleep(3000);
		}
}
