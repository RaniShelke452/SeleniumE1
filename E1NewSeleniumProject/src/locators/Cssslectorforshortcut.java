// in css selctor 3 shortcut ^=starting.$=ending *=middle or match any charcter

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssslectorforshortcut {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();// to launch chrome browser
		   driver.manage().window().maximize();// to maxmize the window
		   driver.get("https://www.instagram.com/accounts/login/");// to lauch web app
		   Thread.sleep(2000);
		   
		   //to find/locate username textbox and pass the inputs
		   WebElement usnTB=driver.findElement(By.cssSelector("input[aria-label^='Ph']"));
		   usnTB.sendKeys("Qspider");
		   Thread.sleep(2000);
		   
		   //to find/locate password textbos and pass the inputs
		   WebElement passTB = driver.findElement(By.cssSelector("input[type$='word']"));
		   passTB.sendKeys("Pass@123");
		   Thread.sleep(2000);
		   
		   //to click on login button
		   WebElement loginButton= driver.findElement(By.cssSelector("button[type*='bm']"));
		   loginButton.click();
		   
	
}
}
