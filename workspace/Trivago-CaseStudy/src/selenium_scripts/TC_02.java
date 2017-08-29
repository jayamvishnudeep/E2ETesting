package selenium_scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_02 {
	
	// Test Case to Verify whether it navigates to expected url when clicked on images displayed
	
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://room5.trivago.com/");
			driver.manage().window().maximize();
			// 1st Image
			driver.findElement(By.xpath("//*[@id='editors_pick']/div[1]/a/span/span")).click();
			String Image1Url = driver.getCurrentUrl();
			Image1Url.equals("http://room5.trivago.com/hotels-with-infinity-pools-mexico/");
			Thread.sleep(3000);
			driver.navigate().back();
			String homepage = driver.getCurrentUrl();
			homepage.equals("http://room5.trivago.com/");
			
			// 2nd Image
			driver.findElement(By.xpath("//*[@id='editors_pick']/div[2]/a/span/span")).click();
			String Image2Url = driver.getCurrentUrl();
			Image2Url.equals("http://room5.trivago.com/asheville-hotels/");
			Thread.sleep(3000);
			driver.navigate().back();
			String check2 = driver.getCurrentUrl();
			check2.equals(homepage);
			
			// 3rd Image
			driver.findElement(By.xpath("//*[@id='editors_pick']/div[3]/a/span/span")).click();
			String Image3Url = driver.getCurrentUrl();
			Image3Url.equals("http://room5.trivago.com/magnificent-hotels-in-disney-world-orlando-for-toddlers-to-teens/");
			Thread.sleep(4000);
			driver.navigate().back();
			
			// 4th Image
			driver.findElement(By.xpath("//*[@id='editors_pick']/div[4]/a/span/span")).click();
			String Image4Url = driver.getCurrentUrl();
			Image4Url.equals("http://room5.trivago.com/romantic-getaways-in-georgia/");
			Thread.sleep(3000);
			driver.navigate().back();
			String check3 = driver.getCurrentUrl();
			check3.equals(homepage);
			driver.quit();		
		}
}
