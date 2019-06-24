package light;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class mobileno_check {
	
	
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
		
		
		FileInputStream input= new FileInputStream("C:\\Users\\venkataswami\\Desktop\\mobile numbers.xls");
		
		Workbook w1= Workbook.getWorkbook(input);
		Sheet s1=w1.getSheet("sheet1");
		//Sheet s1=w1.getSheet("sheet1");
		
		int rows=s1.getRows();
		System.out.println(rows);
		
		for(int i=1;i<rows;i++){
			
			String mobile = s1.getCell(0, i).getContents();
			
			
			driver.findElement(By.id("txtmobi")).sendKeys(mobile);
			driver.findElement(By.id("txtothno")).sendKeys("7989353166");
			 String data=driver.findElement(By.xpath(".//*[@id='smamobi']")).getText();
			 
			 Thread.sleep(1000);
			 
			System.out.println(data);
			
		}
		
		
		
		
		
		
		
		
	}

}
