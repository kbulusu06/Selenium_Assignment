package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_14 extends utility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'toolsContentLeft')]//div[contains(@class,'bSubBlock brandSecondaryBrd secondaryPalette')]")));
		driver.findElement(By.xpath("//div[contains(@class,'toolsContentLeft')]//div[contains(@class,'bSubBlock brandSecondaryBrd secondaryPalette')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		//date field
		driver.findElement(By.xpath("//img[@id='ext-gen148']")).click();
		WebElement Content=driver.findElement(By.xpath("//img[@id='ext-gen148']"));
		Select dropdown=new Select(Content);
		dropdown.selectByVisibleText("Created Date");
		Thread.sleep(2000);		
		//driver.findElement(By.xpath("//div[@class='x-combo-list-item x-combo-selected']")).click();
		//Thread.sleep(2000);
		//Choosing date
		
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
		driver.findElement(By.xpath("///table[@id='ext-gen280']//td[@class='x-date-active x-date-today x-date-selected']//a[@class='x-date-date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen154")).click();
		driver.findElement(By.xpath("//table[@id='ext-gen296']//span[contains(text(),'25')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
		
	}

}
