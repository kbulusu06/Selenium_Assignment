package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_30 extends utility {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]")).getText());
		Thread.sleep(3000)		;
		quitBrowser();

	}

}
