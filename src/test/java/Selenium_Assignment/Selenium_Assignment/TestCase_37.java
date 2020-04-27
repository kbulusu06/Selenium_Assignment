package Selenium_Assignment.Selenium_Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase_37 extends utility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);			
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("tryLexDialogX")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Monday April 27, 2020')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Monday April 27, 2020')]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")));
		driver.findElement(By.xpath("//img[contains(@class,'comboboxIcon')]")).click();
		Thread.sleep(2000);
		//switching to window
		ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());		
		driver.switchTo().window((String)windowTabs.get(1));		
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Other')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		Thread.sleep(2000);
		//driver.close();	
		Thread.sleep(5000);
		driver.switchTo().window((String)windowTabs.get(0));	
		
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		//input[@id='EndDateTime_time']
		WebElement ele = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);//developers 
		Thread.sleep(5000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='timePickerItem_38']")));
		driver.findElement(By.xpath("//div[@id='timePickerItem_38']")).click();
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Weekly')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).click();
		driver.findElement(By.xpath("//img[contains(@class,'calRight')]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'11')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[contains(@class,'monthViewIcon')]")).click();
		
	}

}
