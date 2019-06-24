package light;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class combinations {
	
	
	
public static void main(String[]args) throws Exception{
		
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.buildeeji.com");
		//city
		 driver.findElement(By.id("ddlCityName")).sendKeys("Tirupati");
		   Thread.sleep(1000);
		   driver.findElement(By.id("ddlCityName")).sendKeys(Keys.ARROW_DOWN);
			 Thread.sleep(2000);
			 Robot r = new Robot();
			 r.keyRelease(KeyEvent.VK_ENTER);
			 r.keyPress(KeyEvent.VK_ENTER);
			 
			 
			 //String
		   //	 driver.findElement(By.id("searchInput")).sendKeys("Interior and Exterior Works");
			 driver.findElement(By.id("searchInput")).sendKeys("PG for Gents ( S.V.Nagar )  Tirupati");
		   

			  Thread.sleep(1000);
			  driver.findElement(By.id("searchInput")).sendKeys(Keys.ARROW_DOWN);
			// System.out.println( "String" +data);
				 Thread.sleep(2000);
				 
				 Robot r1 = new Robot();
				 r1.keyRelease(KeyEvent.VK_ENTER);
				 r1.keyPress(KeyEvent.VK_ENTER);
				 Thread.sleep(2000) ;
				// System.out.println("pass");
				 
				 driver.findElement(By.id("btnSearch")).click();
				 
				 for(int j=1;j<3;j++)
				 {
					 
				
				// page count
				String page=driver.findElement(By.xpath(".//*[@id='menu1']/div[6]/ul/li/a")).getText();
				                                        // .//*[@id='menu1']/div[16]/ul/li/a
				                                        // .//*[@id='menu1']/div[6]/ul/li/a
				 
				 System.out.println("page count:"+page);
				 
				 List<WebElement> buttons = driver.findElements(By.className("bua"));

					String s = driver.findElement(By.xpath(".//*[@id='menu1']/div[1]/div[4]/div[3]/table/tbody/tr/td")).getText();
					                                        

				//	System.out.println("new link: " + s);
					System.out.println("no of listings: " + buttons.size());
					FileInputStream f1 = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\combinations.xls");
					Workbook w1 = Workbook.getWorkbook(f1);
					Sheet s1 = w1.getSheet("Sheet1");
					int rows = s1.getRows();
					System.out.println("excel sheet rows:"+rows);
					
					for (int i = 1; i < rows; i++) {

				driver.findElement(By.id("txtCombination")).clear();
						
				String Innercategory= s1.getCell(0, i).getContents();
				  driver.findElement(By.id("txtCombination")).sendKeys(Innercategory);
				   Thread.sleep(1000);
				  driver.findElement(By.id("txtCombination")).sendKeys(Keys.ARROW_DOWN);
				// System.out.println( "String" +data);
					 Thread.sleep(2000);
					 Robot r11 = new Robot();
					 r11.keyRelease(KeyEvent.VK_ENTER);
					 r11.keyPress(KeyEvent.VK_ENTER);
					 Thread.sleep(1000);
					  /* String actualTitle=driver.getTitle();
					   System.out.println("Seo title" +actualTitle);
					   Thread.sleep(2000);*/
					   
					}	
				 
				 
				 }
			 
}

}
