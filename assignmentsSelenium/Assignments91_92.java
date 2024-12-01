package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments91_92 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		
		boolean e1 = driver.findElement(By.id("name")).isDisplayed();
		System.out.println(e1);
		
		Thread.sleep(1000);
		boolean e2 = driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).isEnabled();
		System.out.println(e2);
		
		
		
	}
}
