package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://app.jubelio.com/login");
		
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/div[1]/div/input")).sendKeys("qa.rakamin.jubelio@gmail.com");
		
		
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/div[2]/div/input")).sendKeys("Jubelio123!");
		
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button")).click();
		
		wd.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]")).click();
		
		wd.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/ul/li[1]/a]")).click();
	
		wd.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/ul/li[1]/ul/li[1]/a/span")).click();
		System.out.println("Suscces!!");
		
		Thread.sleep(5000);
		// TODO Auto-generated method stub

	}
}