package week2.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment1 {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");  
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.linkText("Create new account")).click(); 
				Thread.sleep(5000);
								
				driver.findElement(By.name("firstname")).sendKeys("First NameABC");
				driver.findElement(By.name("lastname")).sendKeys("Last NameXYZ");
				driver.findElement(By.name("reg_email__")).sendKeys("testabc@abc.com");
				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testabc@abc.com");
				driver.findElement(By.name("reg_passwd__")).sendKeys("Password1!");
				WebElement DD = driver.findElement(By.name("birthday_day"));
				Select sec = new Select (DD);
				sec.selectByIndex(4);
				
				WebElement DD1 = driver.findElement(By.name("birthday_month"));
				Select sec1 = new Select (DD1);
				sec1.selectByValue("6");
				
				WebElement DD2 = driver.findElement(By.name("birthday_year"));
				Select sec2 = new Select (DD2);
				sec2.selectByVisibleText("1992");
				
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
				driver.findElement(By.xpath("//button[@name ='websubmit']")).click();
				
				
				
				
	}

}
