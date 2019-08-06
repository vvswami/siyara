package prof_urls;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Encapsulation {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException, Exception {

		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.buildeeji.com/MaterialTrader/PostTrader");

		Thread.sleep(1000);
		// Login with E-Mail Id & Password

		driver.findElement(By.xpath("//h4[contains(text(),'Login with E-Mail Id & Password')]")).click();

		// user name
		driver.findElement(By.id("txtLogin")).sendKeys("7989353166");

		// pass word

		driver.findElement(By.id("txtloginpassword")).sendKeys("123456");
		Thread.sleep(1000);

		// submit

		driver.findElement(By.id("btnloginsubmitt")).submit();

		Thread.sleep(2000);
	
		driver.findElement(By.id("ddlSubCatId")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.id("ddlSubCatId")).sendKeys("Philips Electronic Goods");
		
		Select keywords = new Select(driver.findElement(By.id("ddlSubCatId")));
		keywords.selectByVisibleText("Philips Electronic Goods");
		
System.out.println("Enter search");
		
	}

}
