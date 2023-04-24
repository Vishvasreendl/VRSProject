package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		Thread.sleep(5000);   //java wait command
		driver.manage().window().maximize();   // browser maximize
		Thread.sleep(3000); 
		driver.manage().window().minimize();    // browser minimize
		//driver.close();  // it will close only one browser
		driver.quit();    // it will close all the browsers opened through automation
		
		
	

	}

}
