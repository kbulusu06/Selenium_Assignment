package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_3 extends utility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("siddharthi.B@salesforce.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(2000);		
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(2000);		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	}

}
