package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffMail_Byxpath {
	public static WebDriver driver;
	

		public static void main(String[] args) throws Exception {

	  WebDriverManager.chromedriver().setup();
			
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.rediff.com/");
	  
		driver.findElement(By.xpath("//a[text() = 'Rediffmail']")).click();
	  driver.findElement(By.xpath("//input[@name = 'login']")).sendKeys("seleniumpanda@rediffmail.com");
	  driver.findElement(By.xpath("//input[@name = 'passwd']")).sendKeys("Selenium@123");
	  driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
	  Thread.sleep(3000);
	  driver.quit();
		
	
	}

}
