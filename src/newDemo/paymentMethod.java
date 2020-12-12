package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paymentMethod {
	public static class reedeemCode {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.netflix.com/simplemember/editcredit?locale=en-CA");
			driver.manage().window().maximize();
			driver.findElement(By.id("id_firstName")).sendKeys("pawan");
			driver.findElement(By.id("id_lastName")).sendKeys("kumar");
			driver.findElement(By.id("id_creditCardNumber")).sendKeys("1234564794556");
			driver.findElement(By.id("id_creditExpirationMonth")).sendKeys("12/11");
			driver.findElement(By.id("id_creditCardSecurityCode")).sendKeys("222");
			driver.findElement(By.xpath("//*[@id=\"simplicityPayment-SAVE\"]")).click();

			Thread.sleep(2000);
			String at = driver.getTitle();
			String et = "netflix";
			driver.close();
			if(at.equalsIgnoreCase(et))
			{
				System.out.println("test fail");
			}
			else
			{
				System.out.println("test Success");
			}
		}


}

}	