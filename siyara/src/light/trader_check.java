package light;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class trader_check {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException, Exception {

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.buildeeji.com/MaterialTrader/PostTrader");

		// Login with E-Mail Id & Password

		driver.findElement(By.xpath(".//*[@id='accordion']/div[2]")).click();

		// user name
		driver.findElement(By.id("txtLogin")).sendKeys("7989353166");

		// pass word

		driver.findElement(By.id("txtloginpassword")).sendKeys("123456");
		Thread.sleep(1000);

		// submit

		driver.findElement(By.id("btnloginsubmitt")).submit();

		/*// Excel sheet
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\venkataswami\\Desktop\\Traders_upload data.xls");
		Workbook w1 = Workbook.getWorkbook(f1);
		Sheet s1 = w1.getSheet("Sheet1");
		int rows = s1.getRows();
		System.out.println(rows);

		for (int i = 1; i < rows; i++) {

			String name = s1.getCell(1, i).getContents();
			String comapany = s1.getCell(0, i).getContents();
			String images = s1.getCell(21, i).getContents();
			String year = s1.getCell(2, i).getContents();
			String email=s1.getCell(3,i).getContents();
			String mobile = s1.getCell(4, i).getContents();
			String Address = s1.getCell(5, i).getContents();
			String multiple = s1.getCell(6, i).getContents();
			String city = s1.getCell(7, i).getContents();
			String area = s1.getCell(8, i).getContents();
			String Buildeejiurl = s1.getCell(9, i).getContents();
			String businesstype = s1.getCell(10, i).getContents();
			//String subcategory = s1.getCell(11, i).getContents();
			String searchkeywords = s1.getCell(11, i).getContents();
			String searchkeywords1 = s1.getCell(16, i).getContents();
			String searchkeywords2 = s1.getCell(13, i).getContents();
			String lan1 = s1.getCell(14, i).getContents();
			String lan2 = s1.getCell(15, i).getContents();
			String lan3 = s1.getCell(12, i).getContents();
			String payment = s1.getCell(17, i).getContents();
			String payment1 = s1.getCell(18, i).getContents();
			String payment2 = s1.getCell(19, i).getContents();
			String map = s1.getCell(20, i).getContents();
			
			// company Name
			driver.findElement(By.xpath(".//*[@id='company']")).sendKeys(name);

			// Name
			driver.findElement(By.xpath(".//*[@id='traname']")).sendKeys(comapany);

			
			// year
			
			driver.findElement(By.id("select2-Year_Id-container")).click();
			driver.findElement(By.xpath("html/body/span[2]/span/span[1]/input")).sendKeys(year);
			                             
			driver.findElement(By.xpath("html/body/span[2]/span/span[1]/input")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			
			// Email
			driver.findElement(By.id("MA_PR_Email")).sendKeys(email);
	
			
			driver.findElement(By.xpath(".//*[@id='Year_Id']")).sendKeys(year);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='Year_Id']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			Robot r111 = new Robot();
			r111.keyPress(KeyEvent.VK_ENTER);
			r111.keyRelease(KeyEvent.VK_ENTER);
			// r111.keyRelease(KeyEvent.VK_ENTER);

			// images
			driver.findElement(By.xpath(".//*[@id='imageBrowes']")).sendKeys(images);

			// Address
			driver.findElement(By.xpath(".//*[@id='txtAddress']")).sendKeys(Address);

			// mobile
			driver.findElement(By.xpath(".//*[@id='txtphone']")).sendKeys(mobile);
			Thread.sleep(2000);

			// city
			driver.findElement(By.xpath(".//*[@id='city_name']")).sendKeys(city);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='city_name']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			Robot r1 = new Robot();
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);

			// area
			driver.findElement(By.xpath(".//*[@id='area_id']")).sendKeys(area);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='area_id']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			Robot r11 = new Robot();
			r11.keyPress(KeyEvent.VK_ENTER);
			r11.keyRelease(KeyEvent.VK_ENTER);

			// multiple services
			driver.findElement(By.xpath(".//*[@id='multipleProductid']")).sendKeys(multiple);

			// businesstype
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='select2-Innercat_trader-container']")).click();
			driver.findElement(By.xpath("html/body/span[3]/span/span[1]/input")).sendKeys(businesstype);
			//Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/span[3]/span/span[1]/input")).sendKeys(Keys.ARROW_DOWN);
		//	Thread.sleep(2000);
			
			Robot r1111 = new Robot();
			r1111.keyPress(KeyEvent.VK_ENTER);
			r1111.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			// sub category

			driver.findElement(By.xpath(".//*[@id='select2-ddlSubCatId-container']")).click();
			driver.findElement(By.xpath("html/body/span[3]/span/span[1]/input")).sendKeys(subcategory);
			Thread.sleep(1000);
			driver.findElement(By.xpath("html/body/span[3]/span/span[1]/input")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			Robot r11111 = new Robot();
			r11111.keyPress(KeyEvent.VK_ENTER);
			r11111.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			*/
			
			// search keywords   
			
            driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span")).sendKeys("furniture");
WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span")));                                           
//System.out.println("drop");

List<WebElement> list = driver.findElements(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"));
System.out.println("Auto Suggest List ::" + list.size());


String data=driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span")).getText();
//                                         .//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span

System.out.println(data);


for(int j = 1 ;j<=list.size();j++)
	
{
	//System.out.println(list.get(j).getText());
	
	if(list.get(j).getText().equals("furniture"))
	{
		list.get(j).click();
	//break;
	}  
	
	else{
		
		
		System.out.println("fail");
	}
	
}    



Robot r9 = new Robot();
r9.keyPress(KeyEvent.VK_ENTER);
r9.keyRelease(KeyEvent.VK_ENTER);
			
Thread.sleep(3000);	


driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span")).sendKeys("Home furniture");
WebDriverWait wait1 = new WebDriverWait(driver,10);
wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span")));                                           
//System.out.println("drop");

List<WebElement> list1 = driver.findElements(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"))

;
System.out.println("Auto Suggest List ::" + list1.size());

for(int j = 1 ;j< list1.size();j++)



{
//System.out.println(list.get(j).getText());

if(list1.get(j).getText().equals("Home furniture"))
{
list1.get(j).click();
break;
}                        
}    



Robot r91 = new Robot();
r91.keyPress(KeyEvent.VK_ENTER);
r91.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(3000);


/*

driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span")).sendKeys(searchkeywords2);
WebDriverWait wait11 = new WebDriverWait(driver,10);
wait11.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span")));                                           
//System.out.println("drop");

List<WebElement> list11 = driver.findElements(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"));
//System.out.println("Auto Suggest List ::" + list11.size());

for(int j = 1 ;j< list11.size();j++)



{
//System.out.println(list.get(j).getText());

if(list11.get(j).getText().equals(searchkeywords2))
{
list11.get(j).click();
break;
}                        
}    



Robot r911 = new Robot();
r911.keyPress(KeyEvent.VK_ENTER);
r911.keyRelease(KeyEvent.VK_ENTER);




Thread.sleep(3000);








			
			//  .//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"))
					.sendKeys(searchkeywords);
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"))
					.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			Robot r111111 = new Robot();
			r111111.keyPress(KeyEvent.VK_ENTER);
			r111111.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			
			// search keywords1
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"))
					.sendKeys(searchkeywords1);
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"))
					.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			Robot r91 = new Robot();
			r91.keyPress(KeyEvent.VK_ENTER);
			r91.keyRelease(KeyEvent.VK_ENTER);
			


			
			// search keywords2
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"))
					.sendKeys(searchkeywords2);
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/div[3]/span/span[1]/span"))
					.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			Robot r8 = new Robot();
			r8.keyPress(KeyEvent.VK_ENTER);
			r8.keyRelease(KeyEvent.VK_ENTER);
			
			

			// url
			driver.findElement(By.xpath(".//*[@id='txturl']")).sendKeys(Buildeejiurl);

			
			// languages
			driver.findElement(By.id("Languagesid")).click();
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[1]/span[1]/span"))
					.sendKeys(lan1);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[1]/span[1]/span"))
					.sendKeys(Keys.ENTER);

			
			// lan2
			driver.findElement(By.id("Languagesid")).click();
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[1]/span[1]/span"))
					.sendKeys(lan2);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[1]/span[1]/span"))
					.sendKeys(Keys.ENTER);

			
			// lan3
			driver.findElement(By.id("Languagesid")).click();
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[1]/span[1]/span"))
					.sendKeys(lan3);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[1]/span[1]/span"))
					.sendKeys(Keys.ENTER);

			
			// payment

			driver.findElement(By.id("Paymentid")).click();
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[2]/span[1]/span"))
					.sendKeys(payment);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[2]/span[1]/span"))
					.sendKeys(Keys.ENTER);

			//payment1
			
			driver.findElement(By.id("Paymentid")).click();
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[2]/span[1]/span"))
					.sendKeys(payment1);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[2]/span[1]/span"))
					.sendKeys(Keys.ENTER);

			//payment2
			driver.findElement(By.id("Paymentid")).click();
			
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[2]/span[1]/span"))
					.sendKeys(payment2);
			driver.findElement(By.xpath(".//*[@id='Tradervalida']/div/div[1]/div[2]/div/span[2]/span[1]/span"))
					.sendKeys(Keys.ENTER);

			// Location map
		driver.findElement(By.id("pac-input")).sendKeys(map);

			// submit button
			driver.findElement(By.id("Btnsubmit")).submit();

			Thread.sleep(1000);
			driver.switchTo().alert().accept();

			Thread.sleep(1000);
			System.out.println("upload Record count=" + i);
			driver.get("https://www.buildeeji.com/MaterialTrader/PostTrader");*/

		}
	}
	// System.out.println("Task Completed");
	
//}
