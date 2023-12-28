package PracticeSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver.exe","./drivers/chromedriver.exe/");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.oreo.com/");
//		Dimension size = driver.manage().window().getSize();
//		System.out.println("The browser height is"+size.getHeight());
//		System.out.println("The browser width is"+size.getWidth());
//		Dimension newSize=new Dimension(500,500);
//		driver.manage().window().setSize(newSize);
//		
		System.setProperty("webdriver.chrome.driver.exe","./drivers.chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println("The x position is"+position.getX());
		System.out.println("The y position is"+position.getY());
		Point newPosition=new Point(200,200);
		driver.manage().window().setPosition(newPosition);
	}

}
