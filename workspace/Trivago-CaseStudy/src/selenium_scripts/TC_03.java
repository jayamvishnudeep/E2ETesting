package selenium_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_03 {
	
	// Test Case to Verify search bar is displayed when clicked on 'search' icon and Verify 'Editor's Pick' is displayed when clicked on 'Close' button 
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://room5.trivago.com/");
		// Click on 'Search' Icon  
		driver.findElement(By.xpath("//div[@class='search-icon open-search-layer']/span")).click();
		// Verify Search bar is displayed
		driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		// Click on 'Close' button 
		driver.findElement(By.xpath("//div[@class='search-close']")).click();
	 	// Verify Editor's Pick is displayed
		driver.findElement(By.xpath("//*[@id='editors_pick']/div[1]/a/span/span")).isDisplayed();
		driver.quit();		

	}
}