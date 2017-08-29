package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

public class TC_01 {
	
	// Test Case to Verify the URL and Languages are changed accordingly when a country is selected from the Country Selection Dropdown Component
	
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
		// Select España from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_España = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_España.selectByVisibleText("España");
		// Verify the Page Title
		Assert.assertEquals("Room5: inspiración para tus viajes por trivago.es" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.es/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("ARTÍCULOS DESTACADOS" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Deutschland from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Deutschland = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Deutschland.selectByVisibleText("Deutschland");
		// Verify the Page Title
		Assert.assertEquals("Room5: Das Hotel-Magazin von trivago.de" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.de/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("UNBEDINGT LESEN" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select France from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_France = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_France.selectByVisibleText("France");
		// Verify the Page Title
		Assert.assertEquals("Room5 - Magazine dédié aux hôtels, par trivago.fr" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.fr/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("LE CHOIX DE LA RÉDACTION" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select USA from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_USA = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_USA.selectByVisibleText("USA");
		// Verify the Page Title
		Assert.assertEquals("Room5: hotel inspiration from trivago.com" , driver.getTitle());
		// Verify the Page URL
		//System.out.println(driver.getTitle());
		Assert.assertEquals("http://room5.trivago.com/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("EDITOR'S PICK" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select 香港 from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_香港 = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_香港.selectByVisibleText("香港");
		// Verify the Page Title
		Assert.assertEquals("Room5　由trivago.hk提供的酒店靈感" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.hk/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("編輯精選" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Australia from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Australia = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Australia.selectByVisibleText("Australia");
		// Verify the Page Title
		Assert.assertEquals("Room5: hotel inspiration from trivago.com.au" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.com.au/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("EDITOR'S PICK" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Suomi from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Suomi = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Suomi.selectByVisibleText("Suomi");
		// Verify the Page Title
		Assert.assertEquals("Room5: hotelli-inspiraation tarjoaa trivago.fi" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.fi/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("SUOSITTELEMME" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Türkiye from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Türkiye = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Türkiye.selectByVisibleText("Türkiye");
		// Verify the Page Title
		Assert.assertEquals("Room5: trivago.com.tr'den otel önerileri" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.com.tr/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("EDITÖRÜN SEÇIMI" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Brasil from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Brasil = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Brasil.selectByVisibleText("Brasil");
		// Verify the Page Title
		Assert.assertEquals("Room5: encontre inspiração para a sua próxima estadia em hotel no trivago.com.br" , driver.getTitle());
		// Verify the Page URL
		//System.out.println(driver.getTitle());
		Assert.assertEquals("http://room5.trivago.com.br/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("ARTIGOS EM DESTAQUE" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Portugal from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Portugal = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Portugal.selectByVisibleText("Portugal");
		// Verify the Page Title
		Assert.assertEquals("Room5: Inspiração para as suas viagens, por trivago.pt" , driver.getTitle());
		// Verify the Page URL
		//System.out.println(driver.getTitle());
		Assert.assertEquals("http://room5.trivago.pt/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("DESTAQUE" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select México from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_México = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_México.selectByVisibleText("México");
		// Verify the Page Title
		Assert.assertEquals("Room5 – Inspiración de hoteles por trivago.com.mx" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.com.mx/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("ARTÍCULOS RECOMENDADOS" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select United Kingdom from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_United_Kingdom = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_United_Kingdom.selectByVisibleText("United Kingdom");
		// Verify the Page Title
		Assert.assertEquals("Room5 UK & Ireland - trivago's online hotel magazine" , driver.getTitle());
		// Verify the Page URL
		//System.out.println(driver.getTitle());
		Assert.assertEquals("http://room5.trivago.co.uk/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("EDITOR'S PICK" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Ελλάδα from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Ελλάδα = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Ελλάδα.selectByVisibleText("Ελλάδα");
		// Verify the Page Title
		Assert.assertEquals("Room5: το ταξιδιωτικό blog για ξενοδοχεία από την trivago.gr" , driver.getTitle());
		// Verify the Page URL
		//System.out.println(driver.getTitle());
		Assert.assertEquals("http://room5.trivago.gr/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("ΕΠΙΛΟΓΉ ΣΥΝΤΆΚΤΗ" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Danmark from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Danmark = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Danmark.selectByVisibleText("Danmark");
		// Verify the Page Title
		Assert.assertEquals("Room5: Hotelinspiration fra trivago.dk" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.dk/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("REDAKTIONENS FAVORITTER" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		// Select Singapore from the Country Dropdown and Verify Page Title and Page URL of Selected Country
		Select Countrydropdown_Singapore = new Select (driver.findElement(By.id("select-country"))); // 
		Countrydropdown_Singapore.selectByVisibleText("Singapore");
		// Verify the Page Title
		Assert.assertEquals("Room5: hotel inspiration from trivago.sg" , driver.getTitle());
		// Verify the Page URL
		Assert.assertEquals("http://room5.trivago.sg/" , driver.getCurrentUrl());
		// Verify the selected Countries Language
		Assert.assertEquals("EDITOR'S PICK" , driver.findElement(By.xpath("//div[@class='col-12 center uppercase']")).getText());
		driver.quit();
	}
}