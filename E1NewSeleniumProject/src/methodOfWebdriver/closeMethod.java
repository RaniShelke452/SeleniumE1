package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMethod {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
       WebDriver driver= new ChromeDriver();//to launch chrome browser
       Thread.sleep(5000);// to stop the execuation for 5sec
       driver.close();// to close the browser window
	}

}
