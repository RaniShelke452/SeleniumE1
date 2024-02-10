package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.instagram.com/accounts/login/");
   Thread.sleep(1000);
   WebElement link = driver.findElement(By.xpath("//span[.='Log in with Facebook']"));
   link.click();
   
	}

}
