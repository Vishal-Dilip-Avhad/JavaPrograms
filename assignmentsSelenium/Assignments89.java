package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments89 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		boolean e1 = driver.findElement(By.id("twotabsearchtextbox")).isEnabled();
		System.out.println(e1);
	}
}
