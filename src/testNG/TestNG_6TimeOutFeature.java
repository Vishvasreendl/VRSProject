package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_6TimeOutFeature {
	WebDriver driver;
  @Test(timeOut=3000)
  public void method1() {
	  driver.get("https://www.redmine.org/");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("vishva");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello@1233");
	}
  @Test
  public void method2() {
	  driver.get("https://www.redmine.org/");
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ramya");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello@1233");

  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
