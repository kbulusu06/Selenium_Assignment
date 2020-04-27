package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_22 extends utility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("tryLexDialogX")).click();
		WebElement view=driver.findElement(By.id("fcf"));
		Select dropdown1=new Select(view);
		dropdown1.selectByIndex(1);
		
		//logging out 
		waitForPageElementToVisible(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")));
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		Thread.sleep(5000);
		quitBrowser();
		
		

	}

}
