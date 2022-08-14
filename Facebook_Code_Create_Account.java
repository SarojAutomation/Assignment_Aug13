package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Code_Create_Account {
public static WebDriver driver;
public static Select select; 
		
		@Test
		public void checkDOB() throws Exception { 
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("July");
			driver.findElement(By.xpath("//input[@name= 'lastname']")).sendKeys("Batch");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("1234562341");
			driver.findElement(By.xpath("//input[@id= 'password_step_input']")).sendKeys("Automation");
			select = new Select(driver.findElement(By.xpath("//select[@id= 'month']")));
			select.selectByVisibleText("May");
			select = new Select(driver.findElement(By.xpath("//select[@id= 'day']")));
			select.selectByVisibleText("10");
			select = new Select(driver.findElement(By.xpath("//select[@id= 'year']")));
			select.selectByVisibleText("1998");
	}

}
																												