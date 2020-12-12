package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reedeemCode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/ca/redeem");
		driver.manage().window().maximize();
		driver.findElement(By.id("id_code")).sendKeys("WEENEX10061");
		driver.findElement(By.xpath("//*[@id=\"gift-code-form\"]/div[1]/button")).click();

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
