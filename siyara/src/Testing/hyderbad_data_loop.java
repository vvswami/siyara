package Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class hyderbad_data_loop {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.buildeeji.com/services");


		FileInputStream f = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\Hyderabad_data_loop.xls");

		HSSFWorkbook workbook = new HSSFWorkbook(f);
		HSSFSheet sheet = workbook.getSheetAt(0);

		HSSFCell cell = null;
		int row = sheet.getLastRowNum();
		System.out.println("Total urls--->" + row);

		for (int i = 1; i < row; i++) {
			cell = sheet.getRow(i).getCell(0);
			String url = cell.toString();
			driver.get(url);

			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[@id='menu1']/div[1]/div[4]/div[3]/table/tbody/tr/td/a")).click();
			driver.navigate().back();

		} // for loop

		System.out.println("Task completed");

	}
}

// }
