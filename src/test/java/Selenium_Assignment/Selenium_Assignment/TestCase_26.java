package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_26 extends utility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tryLexDialogX")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("siddharthiB");
		driver.findElement(By.xpath("//input[@id='devname']")).click();		
		driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
		Thread.sleep(3000);
		quitBrowser();

	}

}
