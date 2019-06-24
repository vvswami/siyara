package light;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class number {
	
	
	public static void main(String[]args) throws Exception{
		
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.buildeeji.com/Services/PostService");
		                    
		Thread.sleep(1000);

		// Login with E-Mail Id & Password

		driver.findElement(By.xpath(".//*[@id='accordion']/div[2]")).click();

		// user name
		driver.findElement(By.id("txtLogin")).sendKeys("7989353166");

		// pass word
		driver.findElement(By.id("txtloginpassword")).sendKeys("123456");
		Thread.sleep(1000);

		// submit
		driver.findElement(By.id("btnloginsubmitt")).submit();
		//String mobile = s1.getCell(0, i).getContents();
			
		
		
		
		// Excel sheet
				FileInputStream f1 = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\Loading Data from eclipse hospital_swami--.xls");
				                                          
				Workbook w1 = Workbook.getWorkbook(f1);
				Sheet s1 = w1.getSheet("Hostels");
				int rows = s1.getRows();
				System.out.println(rows);

				
				for (int i = 1; i < rows; i++)
				{

					String name = s1.getCell(0, i).getContents();
		
			driver.findElement(By.id("sername")).sendKeys(name);
			 String data=driver.findElement(By.id("sername")).getText();
				System.out.println(data);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='ValidateServiceID']/div/div[1]/div[2]")).click();
			
			//driver.findElement(By.id("txtothno")).sendKeys("7989353166");
			/*
			 String data=driver.findElement(By.id("sername")).getText();
			System.out.println(data);*/
			 Thread.sleep(1000);
			/*
			  if (data.equals("")){
				  System.out.println("bad mobile number");
					System.out.println(name);
			     }
			 
			 
			 
		
			else
			{
				System.out.println("valid mobile number");
				
				System.out.println(name);
				
				
				
				
			 String data=driver.findElement(By.xpath(".//*[@id='smamobi']")).getText();
			 
			 System.out.println(data);
			 
			}
			 */
			 /*driver.findElement(By.id("txtmobi")).sendKeys("9346479992");
				driver.findElement(By.id("txtothno")).sendKeys("7989353166");
				 String data1=driver.findElement(By.xpath(".//*[@id='smamobi']")).getText();
				 
				 System.out.println(data1);
			 
			 Thread.sleep(1000);
			 */
			
			
		}
		
	}
		
	}

//}

