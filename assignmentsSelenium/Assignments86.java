package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments86 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/Desktop/grotechminds.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("VDAselenium");    //UN
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("V@123");          //pwd
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("Vishal");     //firstname
		//driver.findElement(By.xpath("/html/body/form/input[3]")).click();                //submit
		
		driver.findElement(By.xpath("//input[@name='name1']")).click();                //i have a boy
		//driver.findElement(By.xpath("//input[@type='submit")).click();          //submit
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();      //who are you
		driver.findElement(By.xpath("/html/body/input[6]")).click();     //ready to relocate banglore
		
		WebElement d1 = driver.findElement(By.xpath("/html/body/select"));      //relegion
		Select s = new Select(d1);
		s.selectByIndex(0);
		
		driver.findElement(By.xpath("/html/body/input[7]")).click();          //signup
			
	}
}
