package Selenium_Assignment.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase_6 extends utility{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		WebDriver driver=utility.driver;			
		Thread.sleep(2000);	
		login_details();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.id("userNavLabel")));
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//h3[contains(text(),'Contact')]")));
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		Thread.sleep(2000);
		//switching to Iframe
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bulusu");		
		driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
		Thread.sleep(2000);	
		//posting the comments
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		/*WebElement frame=driver.findElement(By.cssSelector("span#cke_61 iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//body[contains(@class,'chatterPublisherRTE cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]//p")).sendKeys("Hello!!");
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(2000);*/
		//Clicking on File
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")).click();
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='chatterFile']")));
		driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("C:\\Users\\siddh\\eclipse-workspace\\Selenium_Assignment\\credentials.properties");
		//adding picture 
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@class='chatter-photo']"));
		action. moveToElement(we). perform();			
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		Thread.sleep(5000);
		//switching to frame
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));		
		waitForPageElementToVisible((driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"))));
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("C:\\Users\\siddh\\OneDrive\\Pictures\\Saved Pictures\\PrettyMums.jpg");
		Thread.sleep(2000);
		driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
		Thread.sleep(5000);
		Actions action1 =new Actions(driver);
		action1.dragAndDropBy(driver.findElement(By.xpath("//div[contains(@class,'imgCrop_handle imgCrop_handleNW')]")), 100, 120);
		driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		quitBrowser();
		
	}

	

}
