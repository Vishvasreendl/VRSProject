package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNg_2PriorityOrder {
	WebDriver driver;
	@Test(priority=0)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  @Test(priority=3)
	  public void redmine() {
		  driver.get("https://www.redmine.com");
	  }
	  @Test(priority=1)
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  @Test(priority=2)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(priority=4)
	  public void gmail() {
		  driver.get("https://www.gmail.com");
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

}
