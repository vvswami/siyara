package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yellow_pages_com {
	
	
	public static void main(String[]args) throws Exception
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://yellowpages.in/categories");
		
		int f=0;
		for(int i=40;i<=836;i++)
		{
			
			System.out.println("---------------->inner cat count--------------->"+i);
			
			f=f+1;
		
		 String inner=driver.findElement(By.xpath(".//*[@id='MainContent_ulData']/li["+i+"]/a")).getText();
		
		System.out.println(inner);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='MainContent_ulData']/li["+i+"]/a")).click();

		 String result=driver.findElement(By.xpath(".//*[@id='MainContent_ltlHead']")).getText();
		Thread.sleep(1000);
		System.out.println(result);
		
		String actualTitle=driver.getCurrentUrl();
		
	
	        System.out.println(actualTitle);
		
		
driver.navigate().back();


File source=new File("C:\\Users\\venkataswami\\Desktop\\inner_yellow.xls");
FileInputStream input= new FileInputStream(source);
HSSFWorkbook book= new HSSFWorkbook(input);
HSSFSheet sheet=book.getSheetAt(0);

Row row=sheet.createRow(f);

Cell cell=row.createCell(0);

Cell cell1=row.createCell(1);
Cell cell2=row.createCell(2);


cell.setCellValue(inner);

cell1.setCellValue(result);
cell2.setCellValue(actualTitle);



FileOutputStream fos = new FileOutputStream("C:\\Users\\venkataswami\\Desktop\\inner_yellow.xls");
book.write(fos);
fos.close();


		}
		System.out.println("---------------------->Task completed-------------------------->");
		
		
	}
	

}
