package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.footlocker.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.id("SignIn_email_uid")).sendKeys("pawanpandey112@gmail.com");
		String at = driver.getTitle();
		String et = "footlocker";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("testSucces");
		}
		else
		{
			System.out.println("test fail");
		}
	}
}