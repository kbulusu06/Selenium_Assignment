package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_19 extends utility  {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//li[@id='Opportunity_Tab']//a[contains(text(),'Opportunities')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);		
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='toolsContentRight']//div[@class='bSubBlock brandSecondaryBrd secondaryPalette']")));
		WebElement Interval=driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select dropdown=new Select(Interval);
		dropdown.selectByIndex(2);
		//
		WebElement Include=driver.findElement(By.xpath("//select[@id='open']"));
		Select dropdown1=new Select(Include);
		dropdown1.selectByVisibleText("Closed Opportunities");
		quitBrowser();
	}

}
