package PracticeSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnSelenium 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//String Title=driver.getTitle();
		//System.out.println(Title);
		//String windowhandle=driver.getWindowHandle();
		//System.out.println(windowhandle);
//		String pagesource=driver.getPageSource();
//		System.out.println(pagesource);
		//System.out.println(driver.getPageSource());
		
	
	}

}
