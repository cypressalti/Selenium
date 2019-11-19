package com.veera.linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileDownloadUploadTest {
	
	@Test()
	public void FileDownloadTest() throws InterruptedException
	{
   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmariappan\\Desktop\\Bajaj\\chromedriver_win32_new\\chromedriver.exe");
    
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\vmariappan\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");

	FirefoxProfile prof = new FirefoxProfile();
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(prof);
	prof.setPreference("browser.download.dir", "D:\\UniqloAPITestAumation\\UniqloSelenium");
	prof.setPreference("browser.download.folderList",2);
	prof.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip,application/pdf");
	WebDriver driver = new FirefoxDriver(options);
	driver.get("https://selenium.dev/downloads/");		
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@href='https://bit.ly/2zm3ZzF']")).click();
	driver.close();
	
	

	}
	
	@SuppressWarnings("unused")
	@Test()
	public void FileUploadTest() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmariappan\\Desktop\\Bajaj\\chromedriver_win32_new\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		    driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cypresstestveera@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alti@123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@data-control-name='share.sharebox_documents']")).click();
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.xpath("//span[@data-control-name='document_share.select_file_local']"));
			Actions actions = new Actions(driver);
			actions.sendKeys("C:\\Users\\vmariappan\\Desktop\\upload.docx");
			
			
			
	
	

	}

}
