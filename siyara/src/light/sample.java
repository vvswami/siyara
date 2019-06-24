package light;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class sample {
	
	
	public static void main(String[]args) throws Exception{
		
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

/*		driver.get("https://www.buildeeji.com/Services/PostService");
		                    
		Thread.sleep(1000);

		// Login with E-Mail Id & Password

		driver.findElement(By.xpath(".//*[@id='accordion']/div[2]")).click();

		// user name
		driver.findElement(By.id("txtLogin")).sendKeys("7989353166");
		
		 String data=driver.findElement(By.id("txtLogin")).getText();
			System.out.println(data);
		
		System.out.println("pass");
*/
		// pass word
		/*	driver.findElement(By.id("txtloginpassword")).sendKeys("123456");
		Thread.sleep(1000);

		// submit
		driver.findElement(By.id("btnloginsubmitt")).submit();
		//String mobile = s1.getCell(0, i).getContents();
			
		
		
		
			driver.findElement(By.id("txtmobi")).sendKeys("7989353166");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='ValidateServiceID']/div/div[1]/div[2]")).click();
			
			//driver.findElement(By.id("txtothno")).sendKeys("7989353166");
			
			 String data=driver.findElement(By.id("txtmobi")).getText();
			System.out.println(data);
			*/
			
			 
		
		//	 driver.get("https://www.buildeeji.com/");
			 
			// driver.get("https://www.buildeeji.com/Services/Hyderabad/Photographer/All-Sublocations");
/*			 
			 
	String data= driver.findElement(By.xpath(".//*[@id='menu1']/div[1]/div[2]/table/tbody/tr[5]/td[2]/div/span[3]")).getText();
				
				System.out.println(data);
				System.out.println("pass");*/
			 
			 
			 
			 
			
			 
/*
				String data= driver.findElement(By.xpath(".//*[@id='1']/a")).getText();
				
				System.out.println(data);
				System.out.println("pass");*/
			 
			 
			 
			/* 
			 driver.findElement(By.id("ddlCityName")).sendKeys("Pune");
				Thread.sleep(1000);
				driver.findElement(By.id("ddlCityName")).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(1000);
				Robot r1 = new Robot();
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
				
				
				
				String data= driver.findElement(By.id("ddlCityName")).getText();
				
				System.out.println(data);
				System.out.println("pass");*/
			 
			 
			 
			 
		driver.get("https://www.justdial.com/Free-Listing");
		 driver.findElement(By.xpath(".//*[@id='fcom']")).sendKeys("Pune");
		 driver.findElement(By.xpath(".//*[@id='fname']")).sendKeys("swami");
		
		 
		 
		 String data= driver.findElement(By.xpath(".//*[@id='fcom']")).getText();
			
			System.out.println(data);
		 
		 
		 
			 System.out.println("pass");
		
			 
			 
			 
			 
			 
			 
			 
			 
			
				
				
				
 
	
		}
		
	}
		
	//}

//}
