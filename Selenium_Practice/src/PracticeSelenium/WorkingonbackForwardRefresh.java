package PracticeSelenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingonbackForwardRefresh 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		driver.get("https://www.snapchat.com/");
		Thread.sleep(2000);
		Navigation navigation=driver.navigate();
		navigation.back();
		Thread.sleep(2000);
		navigation.back();
		Thread.sleep(2000);
		navigation.forward();
		Thread.sleep(2000);
		navigation.refresh();		
	}
}
