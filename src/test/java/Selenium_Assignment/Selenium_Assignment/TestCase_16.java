package Selenium_Assignment.Selenium_Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_16 extends utility {

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
		//Clicking on new
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Siddu06");
		//driver.findElement(By.xpath("//input[@id='opp9']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp9']")));
		driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		//Dropdown for Type
		WebElement Type=driver.findElement(By.xpath("//select[@id='opp11']"));
		Select dropdown=new Select(Type);
		dropdown.selectByIndex(4);
		Thread.sleep(2000);
		
		//switching to window to choose campaign
		driver.findElement(By.xpath("//a[@id='opp17_lkwgt']//img[contains(@class,'lookupIcon')]")).click();
		Thread.sleep(3000);
		ArrayList<String> windowTabs = new ArrayList(driver.getWindowHandles());		
		driver.switchTo().window(windowTabs.get(1));
		driver.switchTo().frame(driver.findElement(By.id("resultsFrame")));
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(@class,'dataCell')]")));
		driver.findElement(By.xpath("//a[contains(@class,'dataCell')]")).click();
		Thread.sleep(2000);
		driver.close();	
		
		driver.switchTo().window(windowTabs.get(0));
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
		//div[contains(@class,'pbHeader')]//input[1]
		quitBrowser();
		
		

	}

}
