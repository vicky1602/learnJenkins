package Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param {
	WebDriver driver;
	@Test
	@Parameters({"url"})
		public  void LaunchFirFoxWithProfile1(String url) {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("LoginNameNew")).click();
		driver.findElement(By.id("LoginNameNew")).clear();
		driver.findElement(By.id("LoginNameNew")).sendKeys("vipanshu");
		driver.findElement(By.id("PasswordNew")).click();
		driver.findElement(By.id("PasswordNew")).clear();
		driver.findElement(By.id("PasswordNew")).sendKeys("India@123");
		/*else if(browser= "chrome")
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.tboholidays.com");
			driver.findElement(By.id("LoginNameNew")).click();
			driver.findElement(By.id("LoginNameNew")).clear();
			driver.findElement(By.id("LoginNameNew")).sendKeys("vipanshu");
			driver.findElement(By.id("PasswordNew")).click();
			driver.findElement(By.id("PasswordNew")).clear();
			driver.findElement(By.id("PasswordNew")).sendKeys("India@123");
		}*/
					
		}

}
