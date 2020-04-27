package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_4B extends utility  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("123");
		driver.findElement(By.id("password")).sendKeys("22131");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
		quitBrowser();

	}

}
