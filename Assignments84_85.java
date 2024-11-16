package AssignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignments84_85 {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/left-double-click/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='popup1']"));
		
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();
		driver.close();
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://grotechminds.com/rightclick/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
        
		WebElement e2 = driver1.findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[1]"));
		
		Actions a2 = new Actions(driver);
		a2.contextClick(e2).perform();
		driver.close();
		
	}

}
