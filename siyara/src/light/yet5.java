package light;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yet5 {

	//private static final String Fileinputstream = null;

	public static void main(String[] args) throws InterruptedException, IOException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// .net institutions
		driver.get("https://www.yet5.com/");
int f=0;
		for (int i =242; i <= 430; i++) {

			System.out.println("page count----------------------------------------------->" + i);
			driver.get(" https://www.yet5.com/training/1/"+i+"/net-training-institutes.html");
			           

			int[] marks ={1};
					//1, 6, 12, 18, 24, 30, 35, 41, 47, 53

			for (int j = 0; j < marks.length; j++) {

				f=f+1;
				
				System.out.println("Record number--->" +j);
				//System.out.println(marks[j]);

				Thread.sleep(1000);
				// Read more click
				driver.findElement(By.xpath(".//*[@id='contleft']/div[1]/div["+marks[j]+"]/div[1]/a/strong")).click();
				                                                        //    [" + array[i] + "]
				
				Thread.sleep(1000);
				// company name

				String company = driver
						.findElement(By
								.xpath(".//*[@id='middleblue-cont']/div[1]/h1/div/span"))
						.getText();

				System.out.println(company);
				Thread.sleep(1000);

				// main Address and postal

				String address = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div/div[1]"))
						.getText();

				System.out.println(address);


				String phone = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[1]/span"))
						.getText();

				System.out.println(phone);

				Thread.sleep(1000);

				// mobile

				String mobile = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[2]"))
						.getText();

				System.out.println(mobile);
				Thread.sleep(1000);

				// website
				String website = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[4]"))
						// .//*[@id='middleblue-cont-top-left']/div[1]/p[4]
						.getText();

				System.out.println(website);

				driver.navigate().back();

				Thread.sleep(2000);
				
				File source=new File("C:\\Users\\venkataswami\\Desktop\\yet_professionals.xls");
				
				FileInputStream input=new FileInputStream(source);
		
				HSSFWorkbook wb=new HSSFWorkbook(input);
				HSSFSheet sheet=wb.getSheetAt(0);

				sheet.getRow(0).createCell(f).setCellValue(company);
                sheet.getRow(1).createCell(f).setCellValue(address);
               sheet.getRow(2).createCell(f) .setCellValue(phone);
               sheet.getRow(3).createCell(f).setCellValue(mobile);
				sheet.getRow(4).createCell(f).setCellValue(website);

				FileOutputStream output=new FileOutputStream(source);

				wb.write(output);
                wb.close();
			
				Thread.sleep(1000);
	
				
			} // array loop

		} // for loop end

	}

}
