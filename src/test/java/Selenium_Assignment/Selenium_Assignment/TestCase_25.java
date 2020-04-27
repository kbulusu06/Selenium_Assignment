package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_25 extends utility {

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
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Bulusu");
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("sid123");
		driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
		Thread.sleep(4000);
		quitBrowser();

	}

}
