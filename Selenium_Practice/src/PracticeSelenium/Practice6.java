package PracticeSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.maybelline.com/");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();
		
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.nykaafashion.com/");
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(1000);
		Set<String> windowID = driver.getWindowHandles();
		for(String New:windowID)
		{
			if(driver.switchTo().window(New).getTitle().contains("Men"))
			{
				driver.findElement(By.linkText("Careers")).click();
			}
		}
		driver.switchTo().window(parentId).close();
		
		
		
	}

}
