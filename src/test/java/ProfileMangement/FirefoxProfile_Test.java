package ProfileMangement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class FirefoxProfile_Test {
	
	//@Test
	public static void LaunchFirFoxWithProfile1() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver;
		ProfilesIni profile=new ProfilesIni();
		org.openqa.selenium.firefox.FirefoxProfile fxprofile=profile.getProfile("automation");
		FirefoxOptions option= new FirefoxOptions();
		option.setProfile(fxprofile);
		driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.tboholidays.com");
		driver.findElement(By.id("LoginNameNew")).click();
		driver.findElement(By.id("LoginNameNew")).clear();
		driver.findElement(By.id("LoginNameNew")).sendKeys("vipanshu");
		driver.findElement(By.id("PasswordNew")).click();
		driver.findElement(By.id("PasswordNew")).clear();
		driver.findElement(By.id("PasswordNew")).sendKeys("India@123");
		driver.findElement(By.id("LoginImageNew")).click();
				
	}
	
	//@Test
	@Parameters({"url"})
	public static void LaunchFirFoxWithProfile(String url) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("LoginNameNew")).click();
		driver.findElement(By.id("LoginNameNew")).clear();
		driver.findElement(By.id("LoginNameNew")).sendKeys("vipanshu");
		driver.findElement(By.id("PasswordNew")).click();
		driver.findElement(By.id("PasswordNew")).clear();
		driver.findElement(By.id("PasswordNew")).sendKeys("India@123");
		//driver.findElement(By.id("LoginImageNew")).click();
				
	}
	
	
	@Test
	public static void launchChromeWithProfile() throws InterruptedException
	{
	
		WebDriverManager.getInstance(CHROME).setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/91882/AppData/Local/Google/Chrome/User Data/Profile 2");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.tboholidays.com");
		driver.findElement(By.id("LoginNameNew")).click();
		driver.findElement(By.id("LoginNameNew")).clear();
		driver.findElement(By.id("LoginNameNew")).sendKeys("vipanshu");
		driver.findElement(By.id("PasswordNew")).click();
		driver.findElement(By.id("PasswordNew")).clear();
		driver.findElement(By.id("PasswordNew")).sendKeys("India@123");
		driver.findElement(By.id("LoginImageNew")).click();
		Thread.sleep(4000L);
		driver.quit();
	}

}
