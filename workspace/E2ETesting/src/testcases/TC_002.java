package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_002 {
	
	@Test
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://room5.trivago.com/");
		driver.manage().window().maximize() ;
		Thread.sleep(10);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5);
		// Select Italy from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_italy = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_italy.selectByVisibleText("Italia");
		// Verify the Page Title
		Assert.assertEquals("Room5: lasciati ispirare dagli hotel di trivago.it" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.it/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("SCELTI DA NOI" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		driver.quit();
}
}