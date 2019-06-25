package light;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
/*		FileInputStream f1 = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\urlsssssssssss.xls");
		
		Workbook w1 = Workbook.getWorkbook(f1);
		
		Sheet s1 = w1.getSheet("Sheet5");
		int rows = s1.getRows();
		System.out.println(rows);
		
		HSSFCell cell = null;
		for (int i = 0; i < rows; i++) {
			System.out.println(i);
			//cell = s1. getRow(i).length;
			
			@SuppressWarnings("null")
			String url = cell.toString();
			driver.get(url);
			String actualTitle21= driver.getTitle();
			  System.out.println("Seo title"+actualTitle21);*/
			
			
		//FileInputStream file = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\urlsssssssssss.xls");
		
		FileInputStream file = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\New_index_urls.xls");
		
		
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(file);
		HSSFSheet sheet = workbook.getSheet("sheet1");
		
		HSSFCell cell = null;
		int row = sheet.getLastRowNum()+1;
		System.out.println(row);
		for (int i = 0; i < row; i++) {
			
			
			if(i%100==0) 
			{
				System.out.println(i);
			}
			//System.out.println(i);
			cell = sheet.getRow(i).getCell(0);
		
			String url = cell.toString();
			driver.get(url);
			
			Thread.sleep(3000);
			//Thread.sleep("1000");
			String actualTitle1= driver.getCurrentUrl();
					
					
					//getTitle();
			  System.out.println("Seo title"+actualTitle1);
		
			
		}
		
	
		
}

 }
