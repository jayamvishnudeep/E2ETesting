package selenium_scripts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_05 {
	
	// Test Case to Verify search bar is displayed when clicked on 'search' icon and Verify 'Editor's Pick' is displayed when clicked on 'Close' button 
	
			public static void main(String[] args) throws InterruptedException  {
				System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://room5.trivago.com/");
				driver.manage().window().maximize() ;
				JavascriptExecutor JE = (JavascriptExecutor)driver;
				WebElement Element = driver.findElement(By.xpath("//*[@id='all_themes_btn']"));
				JE.executeScript("arguments[0].scrollIntoView(true);", Element);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='content']/div/div[11]/div/div/div/div[1]")).isDisplayed();
				String ErrorMsg = driver.findElement(By.xpath("//*[@id='content']/div/div[11]/div/div/div/div[1]/p")).getText();
				ErrorMsg.equals("Please enter a valid e-mail address");
				driver.quit();		

				


}
}
