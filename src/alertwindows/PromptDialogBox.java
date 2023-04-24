package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PromptDialogBox {
	WebDriver driver;
	@Test
	public void alertokbutton() throws Exception {
		driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		
	//	driver.switchTo().alert().sendKeys("Vishva");
	//	driver.switchTo().alert().accept();
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Lakshmi");
		alt.accept();  
		
	}

		
	@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
