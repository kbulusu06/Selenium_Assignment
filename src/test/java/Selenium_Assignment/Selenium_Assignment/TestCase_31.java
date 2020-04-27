package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_31 extends utility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='devname']")).click();
		driver.findElement(By.xpath("//input[@id='devname']")).clear();
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")).click();
		Thread.sleep(5000);
		quitBrowser();
		
		
		
		

	}

}
