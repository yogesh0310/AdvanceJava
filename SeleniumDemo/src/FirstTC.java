import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.comp.Enter;

public class FirstTC {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement searchBox= driver.findElement(By.xpath("//input[@title='Search']"));
		searchBox.sendKeys("youtube");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
