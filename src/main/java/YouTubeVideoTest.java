import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws FindFailed, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		//global wait / dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=22");
		
		//create the object of Screen class - Sikuli
		Screen s = new Screen();
		
		//pause icon:
//		Pattern pauseImg = new Pattern("YT_Pause.png");
//		Thread.sleep(3000);
//		//s.wait(pauseImg, 2000);
//		s.click();
//		
//		//play icon:
//		Pattern playImg = new Pattern("YT_Play.png");
//		Thread.sleep(3000);
//		//s.wait(playImg, 2000);
//		s.click();
		
		//settings icon:
		Pattern settingsImg = new Pattern("YT_Settings.png");
		Thread.sleep(3000);
		s.wait(settingsImg, 2000);
		s.click();
		s.click();
		
	}

}
