package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
WebElement ele = driver.findElement(By.linkText("Today's Deals"));
	System.out.println(ele.getText());
	
	driver.close();
	
	}

}
