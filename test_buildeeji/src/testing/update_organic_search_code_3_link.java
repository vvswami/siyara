package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.apache.poi.ss.usermodel.DataFormatter;

public class update_organic_search_code_3_link {

	public void tc() throws IOException, InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		ArrayList<String> URLs = Readexceldata(0);

		System.out.println("List    : : : " + URLs.size());

		for (int i = 0; i < URLs.size(); i++) {

			driver.findElement(By.className("gLFyf")).sendKeys(URLs.get(i));

			driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

			System.out.println(URLs.get(i));

			for (int k =3; k <= 3; k++) {
				//System.out.println(k);

				driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div[" + k + "]/div/div/div[1]/a/div/cite")).click();

				Thread.sleep(1000);
				driver.navigate().back();
			}
			
			//driver.findElement(By.className("iUh30")).click();
			
			

			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.className("gLFyf")).clear();

		}
		System.out.println("Task completed");
	}

	public ArrayList<String> Readexceldata(int rowNo) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\data1212454545.xls");

		HSSFWorkbook wb = new HSSFWorkbook(fis);

		HSSFSheet s = wb.getSheet("first place");

		Iterator<Row> rowiterator = s.iterator();

		rowiterator.next();

		ArrayList<String> list = new ArrayList<String>();
		while (rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(rowNo).getStringCellValue());

		}

		return list;

	}

	public static void main(String[] args) throws Exception {

		update_organic_search_code_3_link data = new update_organic_search_code_3_link();

		data.tc();
	}

}
