package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_32 extends utility {

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
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'bPageBlock brandSecondaryBrd secondaryPalette')]")));
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		driver.findElement(By.id("con4")).sendKeys("sid123");
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")).click();
		Thread.sleep(5000);
		quitBrowser();
		
	}

}
