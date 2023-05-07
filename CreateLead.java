package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"); 
		WebElement a = driver.findElement(By.id("username"));
		a.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).submit();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName"); 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName"); 
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LocalName"); 
		
		WebElement DD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select (DD);
		sec.selectByIndex(4);
		
		WebElement DD1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(DD1); 
		sec1.selectByVisibleText("Automobile");
		
		WebElement DD2= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2 = new Select(DD2); 
		sec2.selectByValue("OWN_SCORP");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("email@abc.com"); 
		JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		 js1.executeScript("window.scrollBy(0,550)", "");
		WebElement DD3 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sec3 = new Select(DD3); 
		sec3.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		String ab = driver.getTitle();
		System.out.println("Page Title:" +ab);
		
	}

}
