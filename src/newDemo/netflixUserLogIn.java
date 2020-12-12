package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflixUserLogIn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/ca/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("id_userLoginId")).sendKeys("pawanpandey112@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("helloTesting");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/form/button")).click();


//		driver.findElement(By.xpath("//div[@className='btn login-button btn-submit btn-small'/following-sibling::input]")).click();
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
