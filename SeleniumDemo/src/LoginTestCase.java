import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException {
		
//		ArrayList<String> uname=new ArrayList<>();
//		ArrayList<String> pass=new ArrayList<>();
//		
//		uname.add("msdesai@mitaoe.ac.in");
//		pass.add("Mandar");
//		uname.add("gorathod@mitaoe.ac.in");
//		pass.add("gaurav");
//		uname.add("ybgaikwad@mitaoe.ac.in");
//		pass.add("Yogesh123");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:80/Men/");
		String url="http://127.0.0.1:80/Men/";
		

		driver.manage().window().maximize();
		driver.findElement(By.id("ema")).sendKeys("ybgaikwad@mitaoe.ac.in");
		driver.findElement(By.name("lpassword")).sendKeys("Yogesh123");
		driver.findElement(By.id("login")).click();
		String newURL=driver.getCurrentUrl();
		if(url.equals("http://127.0.0.1/Men/itUI.php"))
		{
			System.out.println("Login id and Password is correct.\n Test Case Passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		driver.get("http://localhost/Men/material.php?dept=IT");
		driver.findElement(By.name("load")).click();
		Thread.sleep(7000);
		driver.close();

		
		
				
				
//		}

	}

}
