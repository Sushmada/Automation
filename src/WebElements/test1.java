package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
	     WebElement ele = driver.findElement(By.id("username"));
	     ele.sendKeys("hgshfghfgfgfghgh");
	     Thread.sleep(3000);
	     ele.clear();

	}

}
