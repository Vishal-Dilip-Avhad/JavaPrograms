package assignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignments109 {

    @DataProvider(name="data1")
	public Object[][] method1(){
		
		Object data [][]= new Object [3][7];
		
		data[0][0]="Anil";
		data[0][1]="Rakh";
		data[0][2]="anil@gmail.com";
		data[0][3]="xyz";
		data[0][4]="76, Area 12 ,cottage,MH";
		data[0][5]="76, Area 12 ,cottage,MH";
		data[0][6]="456456";
		
		data[1][0]="Sanju";
		data[1][1]="Samson";
		data[1][2]="Sanju@hmail.com";
		data[1][3]="abc";
		data[1][4]="99, Area 00 ,villa ,KA";
		data[1][5]="99, Area 00 ,villa ,KA";
		data[1][6]="852369";
		
		data[1][0]="Surya";
		data[1][1]="Kumar";
		data[1][2]="Surya@hmail.com";
		data[1][3]="qwe";
		data[1][4]="56, Area 10 ,villa ,PJ";
		data[1][5]="56, Area 10 ,villa ,PJ";
		data[1][6]="876984";
		
		return data;
	}
	
	@Test(dataProvider="data1")
	public  void amazonSearch(String firstname,String lastname, String email,String password ,String presentAds,String permenentAds,String pincode) throws InterruptedException  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	    driver.findElement(By.xpath("//input[@placeholder='first name']")).sendKeys("firstname");
	    driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("lastname");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		WebElement d1 = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select(d1);
		s.selectByIndex(1);
		
        WebElement d2 = driver.findElement(By.xpath("//select[@id='Country']"));
        Select s1 = new Select(d2);
        s1.selectByIndex(8);
        
        WebElement d3 = driver.findElement(By.xpath("//select[@id='Relegion']"));
        Select s2 = new Select(d3);
        s2.selectByIndex(1);
     
		driver.findElement(By.xpath("//textarea[@id='Present-Address']")).sendKeys("presentAds");
		driver.findElement(By.xpath("//textarea[@id='Permanent-Address']")).sendKeys("permenentAds");
		driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys("45575");
		driver.findElement(By.xpath("//input[@id='relocate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='file']")).sendKeys("D:\\file1.txt");
		
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
	}
}
