package prof_urls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class prof_urls {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.buildeeji.com/Account/Moretools");

		driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[7]/a")).click();

		// Login with E-Mail Id & Password
		driver.findElement(By.xpath(".//*[@id='accordion']/div[2]")).click();

		Thread.sleep(1000);

		// user name
		driver.findElement(By.id("txtLogin")).sendKeys("9177054277");

		// pass word
		driver.findElement(By.id("txtloginpassword")).sendKeys("krishna");
		//Thread.sleep(1000);

		// submit
		driver.findElement(By.id("btnloginsubmitt")).submit();

		driver.get("https://www.buildeeji.com/Account/Moretools");

		driver.findElement(By.xpath(".//*[@id='cssmenu']/ul/li[7]/a")).click();

		Thread.sleep(500);

		driver.findElement(By.xpath(".//*[@id='professionals']/a")).click();

		driver.get("https://www.buildeeji.com/listingtool/Professionals?page=1200");

		Thread.sleep(1000);
		String pagecounts = driver.findElement(By.xpath("html/body/div[8]/div[2]/ul/li/div/ul/li[13]/a")).getText();

		String a = pagecounts.trim();
		int z = Integer.parseInt(a);
		System.out.println("Record id=" + z);

		for (int k = 500; k <= z; k++) {

			if (k > 2) {
				driver.get("https://www.buildeeji.com/listingtool/Professionals?page=" + k + "");
			} else {
				driver.get("https://www.buildeeji.com/listingtool/Professionals");
			}

			System.out.println("page No: " + k);
			// loop for listings
			// listing count
			List<WebElement> buttons = driver.findElements(By.className("listname"));

			//String s = driver.findElement(By.xpath("html/body/div[8]/div[101]/div[3]/a/button")).getText();

			//System.out.println("new link: " + s);
			System.out.println("List size is: " + buttons.size());
			int listings = buttons.size();

			for (int i = 1; i <= listings; i++) {
				System.out.println("Record id=" + i);

				// Basic or advance
				int j = i + 1;
				
				try {
					Thread.sleep(1000);
					String RecordType = driver.findElement(By.xpath(" html/body/div[8]/div[" + j + "]/div[1]/h1"))
							.getText();

					System.out.println("Record Type=" + RecordType);

					int x = Integer.parseInt(RecordType);

					if (x == 1) {

						int v = i + 1;

						driver.findElement(By.xpath("html/body/div[8]/div[" + v + "]/div[3]/a/button")).click();
						Thread.sleep(30000);
						if (k > 2) {
							driver.get("https://www.buildeeji.com/listingtool/Professionals?page=" + k + "");
						} else {
							driver.close();
							driver.get("https://www.buildeeji.com/listingtool/Professionals");
						}
						// }
					}

					else {
						int m = i + 1;

						/*
						 * driver.findElement(By.xpath("html/body/div[8]/div[" +
						 * m + "]/div[3]/a/button"));
						 * 
						 * 
						 * List<WebElement> elements =
						 * driver.findElements(By.linkText("More"));
						 * 
						 * //System.out.println(elements.get(i).getAttribute(
						 * "href"));
						 */
						driver.findElement(By.xpath("html/body/div[8]/div[" + m + "]/div[3]/a/button")).click();
						Thread.sleep(15000);
						// about us
						// driver.findElement(By.xpath("html/body/div[6]/div/div/div[1]/div/div[1]/ul/li[2]/a")).click();
						// Thread.sleep(15000);
						// Services

						driver.findElement(By.xpath("html/body/div[6]/div/div/div[1]/div/div[1]/ul/li[3]/a")).click();
						Thread.sleep(15000);

						// Departments
						driver.findElement(By.xpath("html/body/div[6]/div/div/div[1]/div/div[1]/ul/li[4]/a")).click();
						Thread.sleep(15000);

						// Gallery
						driver.findElement(By.xpath("html/body/div[6]/div/div/div[1]/div/div[2]/ul/li[1]/a")).click();
						Thread.sleep(15000);

						// Facilities
						driver.findElement(By.xpath("html/body/div[6]/div/div/div[1]/div/div[2]/ul/li[2]/a")).click();

						Thread.sleep(15000);

						// Archivements

						driver.findElement(By.xpath("html/body/div[6]/div/div/div[1]/div/div[2]/ul/li[3]/a")).click();

						Thread.sleep(15000);

						// Contact us

						driver.findElement(By.xpath("html/body/div[6]/div/div/div[1]/div/div[2]/ul/li[4]/a")).click();

						Thread.sleep(15000);

						if (k > 2) {
							driver.get("https://www.buildeeji.com/listingtool/Professionals?page=" + k + "");

						} else {
							// driver.close();
							driver.get("https://www.buildeeji.com/listingtool/Professionals");
						}

						// driver.navigate().back();
					}
				} // try loop

				catch (Exception e) {

				} // catch block close

			} // loop end

		} // end loop for listings

		// driver.close();

	}

	// }

}
