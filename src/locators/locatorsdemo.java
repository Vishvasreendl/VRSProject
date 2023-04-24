package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class locatorsdemo {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
    @Disabled
	@Test
	void Idnameclassname() {
		driver.get("http://www.prakampanam.com/user");
		driver.findElement(By.id("edit-name")).sendKeys("vishva");
		driver.findElement(By.name("pass")).sendKeys("heello@123");
		driver.findElement(By.className("form-submit")).click();
      // driver.findElement(By.cssSelector("input.form-submit")).click();
        driver.findElement(By.cssSelector(".form-submit")).click();
	}
      @Disabled  
     @Test
      void linktextpartial() throws InterruptedException {
        	driver.get("http://hyderabadreport.com");
        	Thread.sleep(3000);
        	driver.findElement(By.linkText("Photos")).click();
        	driver.findElement(By.partialLinkText("Greater News")).click();
        }
      @Disabled
       @Test
       void tagname() throws InterruptedException{
    	   driver.get("https://google.com");
    	   Thread.sleep(3000);
    	   List<WebElement>totallinks = driver.findElements(By.tagName("a"));
    	   System.out.println(totallinks.size());
       }
      @Test
      void xpath() throws InterruptedException {
    	  driver.get("http://prakampanam.com/user");
    	  driver.manage().window().maximize();
    	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div/form/div/div[1]/input")).sendKeys("vishva");
           Thread.sleep(3000);
           driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Hello@2234");
           Thread.sleep(3000);
           driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img")).click();           
      }
        
        
		
	}

