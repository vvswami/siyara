package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yet5_com {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.yet5.com/training/1/426/net-training-institutes.html");
		int f = 0;
		for (int i = 1; i < 426; i++) {
			try {

				System.out.println("page count---------------->" + i);

				driver.get("https://www.yet5.com/training/1/" + i + "/net-training-institutes.html");

				int[] marks = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
						25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
						49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 };

				for (int j = 0; j < marks.length; j++) {
					try {

						driver.findElement(
								By.xpath(".//*[@id='contleft']/div[1]/div[" + marks[j] + "]/div[1]/a/strong")).click();

						f = f + 1;
						System.out.println("div values-------------------->" + marks[j]);
						// company name

						String company = driver.findElement(By.xpath(".//*[@id='middleblue-cont']/div[1]/h1/div/span"))
								.getText();

						System.out.println(company);
						Thread.sleep(1000);

						// main Address and postal

						String address = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div/div[1]"))
								.getText();

						System.out.println(address);

						String phone = driver
								.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[1]/span"))
								.getText();

						System.out.println(phone);

						Thread.sleep(1000);

						// mobile

						String mobile = driver.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[2]"))
								.getText();

						System.out.println(mobile);
						Thread.sleep(1000);

						// website
						String website = driver
								.findElement(By.xpath(".//*[@id='middleblue-cont-top-left']/div[1]/p[4]"))
								// .//*[@id='middleblue-cont-top-left']/div[1]/p[4]
								.getText();

						System.out.println(website);

						driver.navigate().back();

						Thread.sleep(2000);

						File source = new File("C:\\Users\\venkataswami\\Desktop\\Book1.xls");

						FileInputStream input = new FileInputStream(source);

						HSSFWorkbook wb = new HSSFWorkbook(input);
						HSSFSheet sheet = wb.getSheetAt(0);

						sheet.getRow(0).createCell(f).setCellValue(company);
						sheet.getRow(1).createCell(f).setCellValue(address);
						sheet.getRow(2).createCell(f).setCellValue(phone);
						sheet.getRow(3).createCell(f).setCellValue(mobile);
						sheet.getRow(4).createCell(f).setCellValue(website);
						FileOutputStream output = new FileOutputStream(source);

						wb.write(output);
						wb.close();

						Thread.sleep(1000);

					} 
					catch (Exception e)
					{

					}
				}//2nd for loop

			} catch (Exception e) {

			}
		}

	}

}
