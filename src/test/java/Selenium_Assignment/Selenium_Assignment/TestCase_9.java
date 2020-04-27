package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_9 extends utility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		

	}

}
