package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CanadaLifeBrowser {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://canadalife.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class = 'n-header-ctas-desktop__cta-list-item']/child::a")).click();
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executescript("window.scrollBy(0,300)");
//	driver.findElement(By.xpath("//div[@id = 'aem-card-6-content']/following-sibling::div[1]/child::a[1]")).click();
		driver.findElement(By.cssSelector("div#aem-card-6-content+div>a>span.n-button__label")).click();
	//	driver.findElement(By.cssSelector("div#aem-card-6-content+div>a>span.n-button__label+span")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
