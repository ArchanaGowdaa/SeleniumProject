package PracticeSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Archana%20K%20M/Downloads/MultipleWindow.html");
		Thread.sleep(1000);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		driver.findElement(By.cssSelector("input[value='Open Food Sites']")).click();
		Thread.sleep(1000);
		Set<String> newWindow = driver.getWindowHandles();
		for(String allwindowID:newWindow)
		{
			driver.switchTo().window(allwindowID);
			//System.out.println(driver.getTitle());
			String currenturl=driver.getCurrentUrl();
			if(!currenturl.contains("file:///C:/Users/Archana%20K%20M/Downloads/MultipleWindow.html"))
			{
				driver.close();
				break;
				
			}
			System.out.println(currenturl);
			
			
			/*Dimension size=new Dimension(500,500);
			driver.manage().window().setSize(size);
			
			
			Point position=new Point(200,200);
			driver.manage().window().setPosition(position);*/
		}
		
	}

}
