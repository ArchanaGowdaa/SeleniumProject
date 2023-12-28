package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/7");
		Thread.sleep(15000);
		driver.findElement(By.name("compare")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
