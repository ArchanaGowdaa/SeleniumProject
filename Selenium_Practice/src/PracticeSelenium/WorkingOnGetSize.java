package PracticeSelenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnGetSize
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Archana K M\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		

		driver.get("https://www.oreo.com/");
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();//TO fetch the size of the window
		System.out.println("Browser height is : " +size.getHeight());
		System.out.println("Browser width is : " +size.getWidth());
		Thread.sleep(2000);
		Dimension newSize = new Dimension(500, 500);
		driver.manage().window().setSize(newSize);
		
//		driver.get("https://www.biskfarm.com/");
//		Point point = driver.manage().window().getPosition();//to  fetch the position of the window
//		System.out.println("X position is :" + point.getX());
//		System.out.println("Y position is :" + point.getY());
//		
//		Thread.sleep(2000);  
//		Point targetPosition = new Point(100, 200);
//		driver.manage().window().setPosition(targetPosition);
//		
	}

	
}
