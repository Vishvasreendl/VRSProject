package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopAlertBox {
	WebDriver driver;
  @Test
	  public void alertokbutton() throws Exception {
		  driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
		  Thread.sleep(5000);
		  driver.switchTo().alert().accept();  // Ok button click 

  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
