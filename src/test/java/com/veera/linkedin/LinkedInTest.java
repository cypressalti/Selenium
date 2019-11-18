package com.veera.linkedin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LinkedInTest {
	WebDriver driver;
	
	@Test()
	public void LoginLogoutTest() throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmariappan\\Desktop\\Bajaj\\chromedriver_win32_new\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
    driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cypresstestveera@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alti@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-control-name='nav.settings']")).click();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).isDisplayed();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).click();
	driver.close();

	}
	
	@Test()
	public void CreatePostTest() throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmariappan\\Desktop\\Bajaj\\chromedriver_win32_new\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
    driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cypresstestveera@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alti@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//button[@class='share-box__open share-box__trigger p4 hoverable-link-text t-16 t-black--light t-bold']")).getText());
	
	//Create a Post
	driver.findElement(By.xpath("//button[@data-control-name='share.sharebox_focus']")).click();
	driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("To Create a post ");
	driver.findElement(By.xpath("//button[@data-control-name='share.post']")).click();
	driver.findElement(By.xpath("//div[@class='artdeco-toast-item__content']")).isDisplayed();
	
	//Logout
	driver.findElement(By.xpath("//button[@data-control-name='nav.settings']")).click();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).isDisplayed();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).click();
	//System.out.println("this is the test related to Performance check "+ " " +Thread.currentThread().getId());
	driver.close();

	}
	
	@Test()
	public void CreateMessageTest() throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmariappan\\Desktop\\Bajaj\\chromedriver_win32_new\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
    driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cypresstestveera@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alti@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	
	//Create a Message
	WebElement element = driver.findElement(By.xpath("//div[@class='mh4 msg-overlay-list-bubble msg-overlay-list-bubble--is-minimized ember-view']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().perform();
	driver.findElement(By.xpath("//button[@data-control-name='overlay.compose_message']")).click();
	driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("To Write a Messgae ");
	
	//Logout
	driver.findElement(By.xpath("//button[@data-control-name='nav.settings']")).click();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).isDisplayed();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).click();
	driver.close();

	}
	
	@Test()
	public void FileDownloadTest() throws InterruptedException
	{
   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmariappan\\Desktop\\Bajaj\\chromedriver_win32_new\\chromedriver.exe");
    
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\vmariappan\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");

	//driver=new FirefoxDriver();
	
	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
    System.out.println("Debug 2");
    capabilities.setCapability("marionette", true);
    System.out.println("Debug 3");
    WebDriver driver = new FirefoxDriver(capabilities);
    System.out.println("Debug 4");
    driver.get("http://www.google.com");
    
    
	/*driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cypresstestveera@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alti@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	
	//Create a Message
	WebElement element = driver.findElement(By.xpath("//div[@class='mh4 msg-overlay-list-bubble msg-overlay-list-bubble--is-minimized ember-view']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().perform();
	driver.findElement(By.xpath("//button[@data-control-name='overlay.compose_message']")).click();
	driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("To Write a Messgae ");
	
	//Logout
	driver.findElement(By.xpath("//button[@data-control-name='nav.settings']")).click();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).isDisplayed();
	driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']")).click();
	driver.close();
*/
	}

}
