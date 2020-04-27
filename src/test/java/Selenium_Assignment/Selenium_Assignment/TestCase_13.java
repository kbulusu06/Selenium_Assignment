package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_13 extends utility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='toolsContentRight']//div[@class='bSubBlock brandSecondaryBrd secondaryPalette']")));
		driver.findElement(By.xpath("//div[@class='toolsContentRight']//div[@class='bSubBlock brandSecondaryBrd secondaryPalette']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.id("srch")).sendKeys("si");
		driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();
		driver.findElement(By.id("cid0")).click();
		driver.findElement(By.id("cid1")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]")).click();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")).click();
		//alert box
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();		
		Thread.sleep(1000);
		quitBrowser();

	}

}
//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]