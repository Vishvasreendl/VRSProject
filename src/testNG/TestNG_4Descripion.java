package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_4Descripion {
	WebDriver driver;
  @Test(description="menus")
  public void test1() {
	driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();
  }
  @Test(description="sign-in")
  public void test2() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("vishva");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Hello@1233");
  }
  @Test(description="register")
  public void test3() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("vishva");
  }
  @Test(description="search")
  public void test4() {
	  driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("java");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.redmine.org/");
	  
  }

}
