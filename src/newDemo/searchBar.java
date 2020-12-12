package newDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchBar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/browse");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/input")).sendKeys("friends");
		driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/input")).click();

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
