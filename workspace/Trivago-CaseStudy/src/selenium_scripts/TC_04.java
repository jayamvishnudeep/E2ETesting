package selenium_scripts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_04 {
	
	// Test Case to Verify when clicked on menu, the menu bar gets opened and verify when clicked on countries, pages related to that country should be opened  
	
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://room5.trivago.com/");
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			// Click on USA
			driver.findElement(By.linkText("USA")).click();
			Thread.sleep(3000);
			// Verifying USA URL
			Assert.assertEquals("http://room5.trivago.com/destination/usa/" , driver.getCurrentUrl());
			// Verifying USA Presence
			Assert.assertEquals("USA" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on SOUTHEAST
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[4]/a")).click();
			Thread.sleep(3000);
			// Verifying SOUTHEAST URL
			Assert.assertEquals("http://room5.trivago.com/destination/usa/country/southeast/" , driver.getCurrentUrl());
			// Verifying USA/SOUTHEAST Presence
			Assert.assertEquals("USA / SOUTHEAST" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on MIDWEST
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[6]/a")).click();
			Thread.sleep(3000);
			// Verifying MIDWEST URL
			Assert.assertEquals("http://room5.trivago.com/destination/usa/country/midwest/" , driver.getCurrentUrl());
			// Verifying USA/MIDWEST Presence
			Assert.assertEquals("USA / MIDWEST" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on INTERNATIONAL
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[8]/a")).click();
			Thread.sleep(3000);
			// Verifying INTERNATIONAL URL
			Assert.assertEquals("http://room5.trivago.com/destination/international/" , driver.getCurrentUrl());
			// Verifying INTERNATIONAL Presence
			Assert.assertEquals("INTERNATIONAL" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on ALL DESTINATIONS
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[10]/a")).click();
			Thread.sleep(3000);
			// Verifying ALL DESTINATIONS URL
			Assert.assertEquals("http://room5.trivago.com/destination/all-destinations/" , driver.getCurrentUrl());
			// Verifying DESTINATIONS & INSPIRATION Presence
			Assert.assertEquals("DESTINATIONS & INSPIRATION" , driver.findElement(By.xpath("//div[@class='col-12 col-12-sm uppercase center']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on NORTHEAST
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[3]/a")).click();
			Thread.sleep(3000);
			// Verifying NORTHEAST URL
			Assert.assertEquals("http://room5.trivago.com/destination/usa/country/northeast/" , driver.getCurrentUrl());
			// Verifying NORTHEAST Presence
			Assert.assertEquals("USA / NORTHEAST" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on WEST
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[5]/a")).click();
			Thread.sleep(3000);
			// Verifying WEST URL
			Assert.assertEquals("http://room5.trivago.com/destination/usa/country/west/" , driver.getCurrentUrl());
			// Verifying WEST Presence
			Assert.assertEquals("USA / WEST" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on SOUTHWEST
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[7]/a")).click();
			Thread.sleep(3000);
			// Verifying SOUTHWEST URL
			Assert.assertEquals("http://room5.trivago.com/destination/usa/country/southwest/" , driver.getCurrentUrl());
			// Verifying SOUTHWEST Presence
			Assert.assertEquals("USA / SOUTHWEST" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on MEXICO AND THE CARIBBEAN
			driver.findElement(By.xpath("//ul[@class='single-sub-menu auto-sub-menu']/li[9]/a")).click();
			Thread.sleep(3000);
			// Verifying MEXICO AND THE CARIBBEAN URL
			Assert.assertEquals("http://room5.trivago.com/destination/international/country/mexico-and-the-caribbean/" , driver.getCurrentUrl());
			// Verifying MEXICO AND THE CARIBBEAN Presence
			Assert.assertEquals("INTERNATIONAL / MEXICO AND THE CARIBBEAN" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on BUDGET
			driver.findElement(By.xpath("//ul[2][@class='single-sub-menu auto-sub-menu']/li[2]/a")).click();
			Thread.sleep(3000);
			// Verifying BUDGET URL
			Assert.assertEquals("http://room5.trivago.com/theme/budget/" , driver.getCurrentUrl());
			// Verifying BUDGET Presence
			Assert.assertEquals("BUDGET" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on FAMILY
			driver.findElement(By.xpath("//ul[2][@class='single-sub-menu auto-sub-menu']/li[4]/a")).click();
			Thread.sleep(3000);
			// Verifying FAMILY URL
			Assert.assertEquals("http://room5.trivago.com/theme/family/" , driver.getCurrentUrl());
			// Verifying FAMILY Presence
			Assert.assertEquals("FAMILY" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on SUMMERTRENDS 2017
			driver.findElement(By.xpath("//ul[2][@class='single-sub-menu auto-sub-menu']/li[6]/a")).click();
			Thread.sleep(3000);
			// Verifying SUMMERTRENDS 2017 URL
			Assert.assertEquals("http://room5.trivago.com/summer-travel-trends/" , driver.getCurrentUrl());
			// Verifying SUMMERTRENDS Presence
			Assert.assertEquals("Summer Trends" , driver.findElement(By.xpath("//div[@class='summer-trends-title']/h1[@class='mb-0']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on COUPLES
			driver.findElement(By.xpath("//ul[2][@class='single-sub-menu auto-sub-menu']/li[3]/a")).click();
			Thread.sleep(3000);
			// Verifying COUPLES URL
			Assert.assertEquals("http://room5.trivago.com/theme/couples/" , driver.getCurrentUrl());
			// Verifying COUPLES Presence
			Assert.assertEquals("COUPLES" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on WEEKEND GETAWAYS
			driver.findElement(By.xpath("//ul[2][@class='single-sub-menu auto-sub-menu']/li[5]/a")).click();
			Thread.sleep(3000);
			// Verifying WEEKEND GETAWAYS URL
			Assert.assertEquals("http://room5.trivago.com/theme/weekend-getaways/" , driver.getCurrentUrl());
			// Verifying WEEKEND GETAWAYS Presence
			Assert.assertEquals("WEEKEND GETAWAYS" , driver.findElement(By.xpath("//*[@id='articleheader']")).getText());
			// Click on Menu Button
			driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
			Thread.sleep(2000);
			// Click on ALL THEMES GETAWAYS
			driver.findElement(By.xpath("//ul[2][@class='single-sub-menu auto-sub-menu']/li[7]/a")).click();
			Thread.sleep(3000);
			// Verifying ALL THEMES GETAWAYS URL
			Assert.assertEquals("http://room5.trivago.com/theme/all-themes/" , driver.getCurrentUrl());
			// Verifying ALL THEMES GETAWAYS Presence
			Assert.assertEquals("DESTINATIONS & INSPIRATION" , driver.findElement(By.xpath("//div[@class='col-12 col-12-sm uppercase center']")).getText());
			driver.quit();		

			

			
}
}