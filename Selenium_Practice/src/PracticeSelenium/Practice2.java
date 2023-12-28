package PracticeSelenium;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
		driver.get("https://www.snapchat.com/");
		Thread.sleep(1000);
		Navigation navigation = driver.navigate();
		navigation.back();
		Thread.sleep(1000);
		navigation.forward();
		Thread.sleep(1000);
		navigation.refresh();
		Thread.sleep(1000);
		
	}

}
