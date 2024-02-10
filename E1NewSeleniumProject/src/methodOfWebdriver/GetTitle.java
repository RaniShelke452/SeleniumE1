package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();// to lauch browser
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");// to lauch application
	Thread.sleep(2000);
	String title=driver.getTitle();//get title
	System.out.println(title);
}
}

