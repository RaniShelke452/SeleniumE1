package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnamemethod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://laptop-j0c1is5e/login.do");
		
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		String loginTag = loginbutton.getTagName();
		System.out.println(loginTag);
		
		

	}

}

