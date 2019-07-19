package light;

import static org.testng.Assert.expectThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class direct_url_search {

	public static void main(String[] args) throws InterruptedException, IOException, BiffException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.buildeeji.com");

		File source=new File("C:\\Users\\venkataswami\\Desktop\\Book3.xls");
		FileInputStream input = new FileInputStream(source);

		HSSFWorkbook workbook = new HSSFWorkbook(input);
		HSSFSheet sheet = workbook.getSheetAt(0);

		HSSFCell cell = null;
		int row = sheet.getLastRowNum();
		System.out.println("Total urls--->"+row);
		
		String CurrentURL=null;
		
		
		
		for (int i = 0; i < row; i++) {

			if (i % 100 == 0) {
				
				System.out.println(i);
			}
			try
			{
			cell = sheet.getRow(i).getCell(0);

			String url = cell.toString();
			driver.get(url);
			Thread.sleep(3000);
			String actualTitle1 = driver.getTitle();
			System.out.println("Seo title------------->" + actualTitle1);
			CurrentURL= driver.getCurrentUrl();
			System.out.println(CurrentURL);
			

			 String pagecount=driver.findElement(By.xpath("//div[@id='menu1']//div[@class='container-fluid'][contains(text(),'Page 1 of 1')]")).getText();
			 System.out.println(pagecount);
	
			}
			catch(Exception e)
				
				{
					//System.out.println(e.toString());
				}

		}//for loop
		

		
		
		FileOutputStream output=new FileOutputStream(source);
		workbook.write(output);
		workbook.close();
				Thread.sleep(1000);
	
	
		System.out.println("Task completed");
	}

}
