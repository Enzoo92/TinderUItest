package Tinder.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\enisw\\OneDrive\\Skrivbord\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://tinder.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Log in")).click();
	
	driver.findElement(By.linkText("Log in with Google")).click();

	}

}
