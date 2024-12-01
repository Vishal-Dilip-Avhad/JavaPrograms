package assignmentsSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.netty.util.Timeout;

public class assignments96 {

	@Test
	public void login() {
		Assert.assertEquals(false, false);
	}
	@Test(timeOut = 5000)
	public void Navigate() throws InterruptedException {
		System.out.println("navigation success");
		Thread.sleep(3000);
	}
	@Test
	public void logout() {
		Assert.assertEquals(false, false);
	}
}
