package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_33 extends utility{

	public static void main(String[] args) throws Exception  {
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
		quitBrowser();
		

	}

}
