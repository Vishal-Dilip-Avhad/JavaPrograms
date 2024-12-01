package assignment105_106;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchandQuit {
WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void Launch(String nameofbrowser) {
		System.out.println("launching browser");
		
		if (nameofbrowser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		if (nameofbrowser.equals("edge")) {
			driver= new EdgeDriver();
		}
		if (nameofbrowser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
	}
	@AfterMethod
    public void Quit() throws InterruptedException {
		System.out.println("quitting browser");
		Thread.sleep(5000);
		driver.quit();
	}
}
