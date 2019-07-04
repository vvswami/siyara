package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excel1 {
	public static void main(String args[]) throws IOException, Exception
	{
		
		
		FirefoxDriver driver=new FirefoxDriver(); 
		
		driver.manage().window().maximize();
		driver.get("https://www.yet5.com");
		//int f = 0;
		
	
			
		int f=0;
		for (int i = 1; i <=11; i++)
		{
			
			
			//driver.get("https://www.yet5.com/training/109/"+i+"/biztalk-training-institutes.html");
				//driver.get("https://www.yet5.com/training/111/"+i+"/citrix-training-institutes.html");
			
			
			
			
			driver.get("https://www.yet5.com/training/188/"+i+"/medical-coding-training-institutes.html");
				
			
			System.out.println("page count-->"+i);

			int[] marks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
					25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
					49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
			
		
			for (int j = 0; j < marks.length; j++) 
			{
				
				try
				{
				
				driver.findElement(
						By.xpath(".//*[@id='contleft']/div[1]/div[" + marks[j] + "]/div[1]/a/strong")).click();

				                  
				
				f = f + 1;
				System.out.println("div values-------------------->" + marks[j]);
				// company name

				String company = driver.findElement(By.xpath(".//*[@id='middleblue-cont']/div[1]/h1/div/span"))
						.getText();

				System.out.println(company);
				//Thread.sleep(1000);

				// main Address and postal

				String address = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div/div[1]"))
						.getText();

				System.out.println(address);

				String phone = driver
						.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[1]/span"))
						.getText();

				System.out.println(phone);

				//Thread.sleep(1000);

				// mobile

				String mobile = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[2]"))
						.getText();

				System.out.println(mobile);
				//Thread.sleep(1000);

				// website
				String website = driver
						.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[4]"))
						// .//*[@id='middleblue-cont-top-left']/div[1]/p[4]
						.getText();

				System.out.println(website);

				driver.navigate().back();

//Thread.sleep(1000);
			
		
		File source = new File("C:\\Users\\venkataswami\\Desktop\\originalexcelyet5.com.xls");
		FileInputStream input = new FileInputStream(source);
		HSSFWorkbook wb = new HSSFWorkbook(input);
		HSSFSheet sheet = wb.getSheetAt(0);
		
		 Row row = sheet.createRow(f);
		 Cell cell = row.createCell(1);
		 Cell cell1 = row.createCell(2);
		 Cell cell2 = row.createCell(3);
		 Cell cell3 = row.createCell(4);
		 Cell cell4 = row.createCell(5);
		 cell.setCellType(Cell.CELL_TYPE_STRING);
		 
		 cell.setCellValue(company);
		 cell1.setCellValue(address);
		 cell2.setCellValue(phone);
		 cell3.setCellValue(mobile);
		 cell4.setCellValue(website);
		 //cell.setCellValue();
		 
	
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\venkataswami\\Desktop\\originalexcelyet5.com.xls");
		 wb.write(fos);
		 fos.close();
		 
		
			} //try loop
			// System.out.println("END OF WRITING DATA IN EXCEL");
			 
			
			
			catch(Exception e)
			{
				
				//System.out.println(e.toString());
				//System.out.println("Error");
				
			
			}
				
			}//2nf for
			
			
		} // 1st for loop
		
		System.out.println("Task completed");

	
	//System.out.println("Exit");
	}
}
