package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase_12 extends utility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//ul[@id='tabBar']")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")));
		driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Banana123");
		Thread.sleep(2000);
		//Selecting Field
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcol1']")));
		WebElement Field=driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select dropdown=new Select(Field);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		//Select operator
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fop1']")));
		WebElement Operator=driver.findElement(By.xpath("//select[@id='fop1']"));
		Select dropdown1=new Select(Operator);
		dropdown1.selectByVisibleText("contains");
		Thread.sleep(2000);
		//value
		driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("a");	
		driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/form/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		quitBrowser();
	}
	
	

}
