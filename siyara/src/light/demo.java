package light;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import jxl.read.biff.BiffException;

public class demo {
	
	
	public static void main(String[] args) throws BiffException, IOException, InterruptedException, Exception {

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
	driver.get("https://www.buildeeji.com/ChannelEvents-Productions");
	
	
	String data=driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[1]/ul/li[3]/a")).getText();
	System.out.println(data);
	String expectedTitle = data;

	Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
	/*
	String sValue = "swami";
	
	Assert.assertTrue("Title does not match", expectedTitle.equals(driver.getTitle()));
	
	Assert.assertEquals("Assert Equals Test", sValue);*/
	
	/*
	String expectedTitle = data;

	Assert.assertTrue("Title does not match", expectedTitle.equals(driver.getTitle()));*/

	
	/*String data=driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div[1]/ul/li[3]/a")).getText();
	System.out.println(data);
	*/

	/*
	String number = data;
	int result = Integer.parseInt(number);			
	System.out.println(result);
	*/

/*
List<WebElement> list = driver.findElements(By.xpath("html/body/div[2]/div[2]/div/div/div[1]/ul/li[3]/a"));
System.out.println("Auto Suggest List ::" + list.size());*/



//for(int j = 1 ;j<=1;j++)
	
//{
	//System.out.println(list.get(j).getText());
	/*
	if(data.equals("Services"))
	{
		System.out.println("pass");
	}  
	
	else{
		System.out.println("fail");
	}*/
	
//}  
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
