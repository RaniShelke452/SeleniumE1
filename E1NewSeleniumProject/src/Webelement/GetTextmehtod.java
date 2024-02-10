package Webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextmehtod {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://laptop-j0c1is5e/login.do");
		
		WebElement loginbutton = driver.findElement(By.id("loginButton"));// to find login button
		String loginTExt = loginbutton.getText();// to get the text of login button
		System.out.println(loginTExt);//to print the text of login button in the cansole
		
		WebElement link = driver.findElement(By.id("licenseLink"));//to find the link
		String linkText = link.getText();// to get the text of the link
		System.out.println(linkText);//to print the text of the link
		
	}

}



