package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWeather01 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		
	//driver.findElement(By.xpath("//nav[@id = 'nav-website']/descendant::img[1]")).click();
	//driver.findElement(By.xpath("//li[@class = 'logo']/descendant::img[1]")).click();	
	//driver.findElement(By.xpath("//ul[@id = 'first-level-nav']/descendant::img[1]")).click();
//driver.findElement(By.xpath("//div[@id = 'banner_android']/following::script[1]/following::nav/child::ul/child::li/child::a/child::img")).click();
//driver.findElement(By.xpath("//main[@class = 'wrapper']/preceding::div[1]/preceding::div[1]/preceding::ul/descendant::img[1]")).click();	
//driver.findElement(By.xpath("//main[@class = 'wrapper']/preceding::div[1]/preceding::ul/descendant::img[1]")).click();		
//driver.findElement(By.xpath("//main[contains(@class,  'wrapper')]/preceding::div[1]/preceding::ul/descendant::img[1]")).click();		
//driver.findElement(By.xpath("//main[@class = 'wrapper']/preceding-sibling::div[1]/preceding-sibling::div[2]/following-sibling::script/following-sibling::nav/descendant::img")).click();
//driver.findElement(By.xpath("//div[@id = 'footer-website']/preceding-sibling::main[@class = 'wrapper']/preceding::img[2]")).click();
//	driver.findElement(By.xpath("div[@id = 'footer-website']/preceding-sibling::main[@class = 'wrapper']/preceding::li[@id = 'hamburger']/preceding::img[1]")).click();
//driver.findElement(By.xpath("//div[@id = 'banner_android']/following-sibling::nav[contains(@id, 'nav-website')]/descendant::img[1]")).click();
//	driver.findElement(By.xpath("//div[@id = 'banner_android']/following-sibling::nav[@id = 'nav-website']/descendant::img[1]")).click();
// driver.findElement(By.xpath("//div[@id = 'banner_android']/following::script[1]/following::nav/child::ul[1]/child::li[1]/child::a/child::img[1]")).click();
//driver.findElement(By.xpath("//nav[@id = 'nav-website']/child::ul[1]/child::li[1]/child::a/child::img")).click();	
//driver.findElement(By.xpath("//li[@class= 'logo']/child::a/child::img")).click();	
//	driver.findElement(By.xpath("//style[1]/following-sibling::div[1]/following-sibling::script/following-sibling::nav/descendant::img[1]")).click();
//	driver.findElement(By.xpath("//style[1]/following-sibling::div[1]/following-sibling::script/following-sibling::nav/child::ul/child::li/child::a/child::img[1]"));
//	driver.findElement(By.xpath("//div[@id = 'desktop-menu']/preceding-sibling::li[1]/preceding::img[1]")).click();	
	//	driver.findElement(By.xpath("//div[@id = 'desktop-menu']/preceding::img[2]")).click();
	//	driver.findElement(By.xpath("//div[@id = 'banner_android']/following::img[1]")).click();
	//	driver.findElement(By.xpath("//div[@id = 'banner_android']/descendant::img[1]")).clear();
	//	driver.findElement(By.xpath("//div[@id = 'banner_android']/following-sibling::script/following-sibling::nav/descendant::img[1]")).click();
	//	driver.findElement(By.xpath("//ul[contains(@id, 'mobile-menu')]/preceding-sibling::ul/descendant::img")).click();
		driver.findElement(By.xpath("//ul[contains(@id, 'mobile-menu')]/preceding::img[1]/preceding::img[1]")).click();
	//	driver.findElement(By.xpath("//ul[contains(@id, 'mobile-menu')]/preceding::img[2]")).click();
		
	}

}
