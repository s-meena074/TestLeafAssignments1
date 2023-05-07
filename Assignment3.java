package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login"); 
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).submit();
		String ab = driver.getTitle();
		System.out.println("Page Title:" +ab);
		driver.findElement(By.linkText("Log Out")).click();
		System.out.println("Logged Out Successfully");
		driver.close();
	}

}
