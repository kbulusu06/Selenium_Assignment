package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase_18 extends utility {

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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[contains(@class,'ext-webkit ext-chrome sfdcBody brandQuaternaryBgr')]/div[@id='contentWrapper']/div[contains(@class,'bodyDiv brdPalette brandPrimaryBrd')]/table[@id='bodyTable']/tbody/tr/td[@id='bodyCell']/table[@id='toolsContent']/tbody/tr/td/div[contains(@class,'toolsContentLeft')]/div[1]"));
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
		Thread.sleep(5000);
		quitBrowser();
	}

}
