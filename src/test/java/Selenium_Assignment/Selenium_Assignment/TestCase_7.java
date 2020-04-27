package Selenium_Assignment.Selenium_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_7 extends utility {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		Thread.sleep(2000);
		//Acessing Personal
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")));
		driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='LoginHistory_font']")));
		driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		//clicking on Display
		driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
		waitForPageElementToVisible(driver.findElement(By.id("CustomizeTabs_font")));
		driver.findElement(By.id("CustomizeTabs_font")).click();
		
		WebElement Content=driver.findElement(By.xpath("//select[@id='p4']"));
		Select dropdown=new Select(Content);
		dropdown.selectByVisibleText("Salesforce Chatter");
		//scrolldown
		WebElement ele = driver.findElement(By.xpath("//select[@id='duel_select_0']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);//developers 
		Thread.sleep(5000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//option[contains(text(),'Reports')]")));
		driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		
		//Clicking on Email
		driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='EmailSettings_font']")));
		driver.findElement(By.xpath("//a[@id='EmailSettings_font']")).click();
		driver.findElement(By.xpath("//input[@id='sender_name']")).clear();
		driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("siddharthi B");
		driver.findElement(By.xpath("//input[@id='sender_email']")).clear();
		driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("Siddharthi.bulusu@gmail.com");
		WebElement radio_button =driver.findElement(By.id("auto_bcc1"));
		boolean status = radio_button.isDisplayed();
		 boolean enabled_status=radio_button.isEnabled();
		 boolean selected_status=radio_button.isSelected();
		 radio_button.click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		 //Calender
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='CalendarAndReminders']//a[contains(@class,'header setupFolder')]")).click();
		 waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='Reminders_font']")));
		 driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		 Thread.sleep(2000);
		 waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='testbtn']")));
		 driver.findElement(By.xpath("//input[@id='testbtn']")).click();
		 
		 
		
		
		
		
		
		
		
		

	}

}
