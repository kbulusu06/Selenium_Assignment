package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_24 extends utility  {

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
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
		Thread.sleep(3000);
		quitBrowser();

	}

}
