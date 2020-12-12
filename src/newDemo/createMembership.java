package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createMembership {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/ca/");
		driver.manage().window().maximize();
		driver.findElement(By.id("id_email_hero_fuji")).sendKeys("pawanpandey112@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div[2]/form/div/div/button/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/button")).click();

		Thread.sleep(2000);
		String at = driver.getTitle();
		String et = "footlocker";
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
