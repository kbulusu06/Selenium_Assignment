package Selenium_Assignment.Selenium_Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_8 extends utility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(@class,'debugLogLink menuButtonMenuLink')]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'debugLogLink menuButtonMenuLink')]")).click();
		ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());
		System.out.println(windowTabs.size()); 
		driver.switchTo().window(windowTabs.get(1));		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(windowTabs.get(0));
		Thread.sleep(2000);
	}

}
