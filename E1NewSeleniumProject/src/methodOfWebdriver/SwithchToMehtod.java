package methodOfWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithchToMehtod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();// to lauch the browser
		Thread.sleep(2000);
		driver.manage().window().maximize();// to maximize the window
	    Thread.sleep(2000);
		driver.get("https://www.google.co.in/");// to lauch the application
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);// to swith the curson on active element
	}
}
