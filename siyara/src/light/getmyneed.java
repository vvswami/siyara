package light;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getmyneed {
	
	
	
public static void main(String[]args) throws Exception{
		
		
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		//driver.get("https://www.getmyneed.com/institute/12630");
		
		driver.get("https://www.getmyneed.com/institute/167");
		
		
		//.//*[@id='top-banner-and-menu']/div/div/div[1]/section/main/div/div/aside/div/div[3]/div[3]/ul
		
		
		
		if(driver.findElement(By.xpath(".//*[@id='top-banner-and-menu']/div/div/div[1]/section/main/div/div/aside/div/div[3]/div[3]")) != null)
		{
			
String keywords= driver.findElement(By.xpath(".//*[@id='top-banner-and-menu']/div/div/div[1]/section/main/div/div/aside/div/div[3]/div[3]")).getText();
		
		System.out.println("Keywords-->" +keywords);
		
		}
	/*	else
		{
			System.out.println("No keywords");
		}
		*/
		
		//driver.findElement(By.xpath(""))

}
}