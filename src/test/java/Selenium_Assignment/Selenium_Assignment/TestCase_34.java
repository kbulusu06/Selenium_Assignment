package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_34 extends utility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tryLexDialogX")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'siddharthi B')]")));
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'siddharthi B')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='lastName']")));
		driver.findElement(By.xpath("//input[@id='lastName']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("ABCD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		Thread.sleep(3000);
		quitBrowser();
		
	}

}
