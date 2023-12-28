package PracticeSelenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask1 
{
	

	public static void main(String[] args) throws IOException
	{
		File file=new File("Arpitha.txt");
		if(!file.exists())
		{
			System.out.println("file is created");
			file.createNewFile();
			
		}
		else
		{
			System.out.println("file is already created");
		}
		FileOutputStream fos=new FileOutputStream(file);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		fos.write(driver.getTitle().getBytes());
		fos.write(driver.getCurrentUrl().getBytes());
		
	}

}
