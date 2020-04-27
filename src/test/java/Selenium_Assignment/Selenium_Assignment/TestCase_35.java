package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class TestCase_35 extends utility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);			
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//img[contains(@class,'allTabsArrow')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='customize']")));
		driver.findElement(By.xpath("//input[@name='customize']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='duel_select_1']")));
		//removing the libraries tab
		driver.findElement(By.xpath("//option[contains(text(),'Libraries')]")).click();
		driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		
		//logging out
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
		login_details();
		quitBrowser();
		
		

	}

}
