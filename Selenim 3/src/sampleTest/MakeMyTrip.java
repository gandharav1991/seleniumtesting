package sampleTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	
	WebDriver driver;
	
	@Before
	
	public void opennow() {
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
  
	
	@Test
	
	public void test() throws Exception{
		
		driver.get("https://www.makemytrip.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ui-id-32']/div/p[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__sTo']")).click();
		driver.findElement(By.xpath("//*[@id='js-filterOptins']")).click();
	
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.tagName("html")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.id("ui-id-145 ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='dp1486290147516']/div/div[1]/table/tbody/tr[2]/td[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__return']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='dp1486290147517']/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='js-adult_counter']/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='hp-widget__class']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='js-classFilters']/div[1]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("html/body/page-view/div/div/div[2]/div[3]/div[5]/div[3]/div[1]/div/div[1]/div[1]/div/div[3]/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='inputEmailIdForLoggin']")).sendKeys("gsndharavkatyal@gmail.com");
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div/div[1]/div[10]/div[1]/a")).click();
		
	}
	
	
	@After
	
	public void close(){
		driver.close();
	}
}
