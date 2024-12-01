package assignmentsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments88 {

	public static void main(String[] args) throws InterruptedException {
	 //div[@class='s-suggestion s-suggestion-ellipsis-direction']

		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		e1.sendKeys("Pune");
		Thread.sleep(2000);
		
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int len = l1.size();
		System.out.println(len);
		
		for (int i=0; i<len; i++) {
		WebElement a1 = l1.get(i);
		String autosugession =a1.getText();
		System.out.println(autosugession);
	}
	}
}
