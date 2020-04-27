package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_27 extends utility {

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
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'bPageBlock brandSecondaryBrd secondaryPalette')]")));
		
		WebElement view=driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
		Select dropdown1=new Select(view);
		dropdown1.selectByIndex(0);
		quitBrowser();

	}

}
