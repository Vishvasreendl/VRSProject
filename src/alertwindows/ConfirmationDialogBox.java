package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ConfirmationDialogBox {
	WebDriver driver;
  @Test
	public void alertcancelbutton() throws Exception {
		driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();  // Click on Cancel Button
	}

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
