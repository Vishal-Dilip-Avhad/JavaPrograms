package assignment105_106;
import org.openqa.selenium.By;
//WAP using TestNG annotations to launch browser ,search amazon product and log out use> BeforeMethod , Test , After Method.
import org.testng.annotations.Test;

public class test1 extends LaunchandQuit{
	@Test
	public void SearchingProduct_Logout() throws InterruptedException {
		System.out.println("ProductSearching...");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
	}
}
