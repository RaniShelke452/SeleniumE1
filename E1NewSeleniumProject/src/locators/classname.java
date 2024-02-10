package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
	Thread.sleep(2000);
	WebElement passTextBox= driver.findElement( By.className("pass-textbox"));
	passTextBox.sendKeys("admin");
	
	)
}
}
