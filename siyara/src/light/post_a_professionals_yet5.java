package light;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class post_a_professionals_yet5 {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException, Exception {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		 * 
		 * ChromeDriver driver= new ChromeDriver();
		 */

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.buildeeji.com/Professional/Postprofessional");

		Thread.sleep(1000);

		// Login with E-Mail Id & Password

		driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).click();

		Thread.sleep(1000);
		// user name
		driver.findElement(By.id("txtLogin")).sendKeys("7989353166");

		// pass word
		driver.findElement(By.id("txtloginpassword")).sendKeys("123456");
		Thread.sleep(1000);

		// submit
		driver.findElement(By.id("btnloginsubmitt")).submit();

		// Excel sheet

		FileInputStream f1 = new FileInputStream("C:\\Users\\venkataswami\\Desktop\\yet_prof.xls");
		Workbook w1 = Workbook.getWorkbook(f1);
		Sheet s1 = w1.getSheet("Hospitals");
		int rows = s1.getRows();
		System.out.println("Total Records in Excel"+rows);

		for (int i = 1; i < rows; i++) {

			try {

				String name = s1.getCell(0, i).getContents();
				String comapany = s1.getCell(1, i).getContents();
				String year = s1.getCell(2, i).getContents();
				String images = s1.getCell(3, i).getContents();
				String locality = s1.getCell(4, i).getContents();
				String Address = s1.getCell(5, i).getContents();
				String specilization = s1.getCell(6, i).getContents();
				String mobile = s1.getCell(7, i).getContents();
				String othernumber = s1.getCell(8, i).getContents();
				String land = s1.getCell(9, i).getContents();
				String multiple = s1.getCell(10, i).getContents();
				String city = s1.getCell(11, i).getContents();
				String area = s1.getCell(12, i).getContents();
				String keywords = s1.getCell(13, i).getContents();
				String External = s1.getCell(4, i).getContents();
				String Buildeejiurl = s1.getCell(15, i).getContents();
				String maincategory = s1.getCell(16, i).getContents();
				String maincategory1 = s1.getCell(17, i).getContents();
				String maincategory2 = s1.getCell(18, i).getContents();
				String maincategory3 = s1.getCell(19, i).getContents();
				String maincategory4 = s1.getCell(20, i).getContents();
				String maincategory5 = s1.getCell(21, i).getContents();
				String maincategory6 = s1.getCell(22, i).getContents();
				String maincategory7 = s1.getCell(23, i).getContents();
				String maincategory8 = s1.getCell(24, i).getContents();
				String maincategory9 = s1.getCell(25, i).getContents();
				String parent = s1.getCell(26, i).getContents();
				String lan = s1.getCell(27, i).getContents();
				String lan1 = s1.getCell(28, i).getContents();
				String lan2 = s1.getCell(29, i).getContents();
				String payment = s1.getCell(30, i).getContents();
				String payment1 = s1.getCell(31, i).getContents();
				String payment2 = s1.getCell(32, i).getContents();
				String map = s1.getCell(33, i).getContents();

				// Name
				driver.findElement(By.id("proname")).sendKeys(name);

				// company Name
				driver.findElement(By.id("textcomp")).sendKeys(comapany);

				// year
				Select estd = new Select(driver.findElement(By.id("Year_Id")));
				estd.selectByVisibleText(year);

				// images
				driver.findElement(By.id("imageBrowes")).sendKeys(images);

				// locality

				driver.findElement(By.id("Address")).sendKeys(locality);

				// mobile
				driver.findElement(By.id("textmobile")).sendKeys(mobile);

				// Address
				driver.findElement(By.id("profaddress")).sendKeys(Address);

				// specilization
				driver.findElement(By.id("textareaspe")).sendKeys(specilization);

				// other number
				driver.findElement(By.id("othtxtmobi")).sendKeys(othernumber);

				// landline number
				driver.findElement(By.id("profland")).sendKeys(land);

				// multiple services
				driver.findElement(By.id("textareamulti")).sendKeys(multiple);

				// city

				driver.findElement(By.xpath(" .//*[@id='city_Dist_Id']")).sendKeys(city);
				Thread.sleep(1000);
				driver.findElement(By.xpath(" .//*[@id='city_Dist_Id']")).sendKeys(Keys.ARROW_DOWN);
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);

				// area

				driver.findElement(By.xpath(".//*[@id='Area_ID']")).sendKeys(area);
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[@id='Area_ID']")).sendKeys(Keys.ARROW_DOWN);
				Robot e = new Robot();
				e.keyPress(KeyEvent.VK_ENTER);
				e.keyRelease(KeyEvent.VK_ENTER);

				// keywords
				driver.findElement(By.id("seoproid")).sendKeys(keywords);

				Thread.sleep(1000);

				// External url
				driver.findElement(By.id("ExternalURL")).sendKeys(External);

				// url
				driver.findElement(By.id("profurl")).sendKeys(Buildeejiurl);

				Thread.sleep(1000);

				// mian category
				Select main = new Select(driver.findElement(By.id("ProfSubCat")));
				main.selectByVisibleText(maincategory);

				// main1
				Select main1 = new Select(driver.findElement(By.id("ProfSubCat")));
				main1.selectByVisibleText(maincategory1);

				// main2
				Select main11 = new Select(driver.findElement(By.id("ProfSubCat")));
				main11.selectByVisibleText(maincategory2);

				// main3
				Select main111 = new Select(driver.findElement(By.id("ProfSubCat")));
				main111.selectByVisibleText(maincategory3);

				// main4
				Select main1111 = new Select(driver.findElement(By.id("ProfSubCat")));
				main1111.selectByVisibleText(maincategory4);

				// main5
				Select main11111 = new Select(driver.findElement(By.id("ProfSubCat")));
				main11111.selectByVisibleText(maincategory5);

				// main6
				Select main111111 = new Select(driver.findElement(By.id("ProfSubCat")));
				main111111.selectByVisibleText(maincategory6);

				// main7
				Select main1111111 = new Select(driver.findElement(By.id("ProfSubCat")));
				main1111111.selectByVisibleText(maincategory7);

				// main8
				Select main11111111 = new Select(driver.findElement(By.id("ProfSubCat")));
				main11111111.selectByVisibleText(maincategory8);

				// main9
				Select main111111111 = new Select(driver.findElement(By.id("ProfSubCat")));
				main111111111.selectByVisibleText(maincategory9);

				Thread.sleep(1000);
				// parent category

				Select sub = new Select(driver.findElement(By.id("SerSubCategory")));
				sub.selectByVisibleText(parent);

				// language1

				Select language1 = new Select(driver.findElement(By.id("ProfLanguageid")));
				language1.selectByVisibleText(lan);

				// language2

				Select language2 = new Select(driver.findElement(By.id("ProfLanguageid")));
				language2.selectByVisibleText(lan1);

				// language3

				Select language3 = new Select(driver.findElement(By.id("ProfLanguageid")));
				language3.selectByVisibleText(lan2);

				// payment1
				Select pay = new Select(driver.findElement(By.id("ProfPayment")));
				pay.selectByVisibleText(payment);

				// payment1
				Select pay1 = new Select(driver.findElement(By.id("ProfPayment")));
				pay1.selectByVisibleText(payment1);

				// payment1
				Select pay2 = new Select(driver.findElement(By.id("ProfPayment")));
				pay2.selectByVisibleText(payment2);

				// Location map
				driver.findElement(By.id("pac-input")).sendKeys(map);

				// submit button
				driver.findElement(By.id("subid")).submit();

				// click();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();

				System.out.println("upload Record count=" + i);

			} //try loop close
			
			catch (Exception e)
			{
				//System.out.println(e.toString());
			}
			driver.get("https://www.buildeeji.com/Professional/Postprofessional");
			
		} // for loop end

		System.out.println("Task Completed");
	}

}

