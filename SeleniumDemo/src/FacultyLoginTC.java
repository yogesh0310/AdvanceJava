import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacultyLoginTC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:80/Men/");
		String url="http://127.0.0.1:80/Men/";
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.cssSelector("label[for='switch1']"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		driver.findElement(By.id("ema")).sendKeys("tonystark@mitaoe.ac.in");
		driver.findElement(By.name("lpassword")).sendKeys("tony123");
		driver.findElement(By.id("login")).click();
//		String newURL=driver.getCurrentUrl();
		if(url.equals("http://localhost/Men/ITUIFaculty.php"))
		{
			System.out.println("Login id and Password is correct.\n Test Case Passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		driver.get("http://localhost/Men/addMaterial.php?dept=IT");
		Thread.sleep(7000);
		driver.close();

	}

}
