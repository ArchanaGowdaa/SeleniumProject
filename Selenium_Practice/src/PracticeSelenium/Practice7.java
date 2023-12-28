package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe/");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("dfghkklimnop");
		driver.findElement(By.id("Password")).sendKeys("ArchanaGowda22499@");
		driver.findElement(By.cssSelector("input[class=\"button-1 login-button\"]")).click();
		Thread.sleep(1000);
		String ErrorMsg = driver.findElement(By.xpath("//span[text()='Please enter a valid email address.']")).getText();
		System.out.println(ErrorMsg);
		
		
		
	}

}
