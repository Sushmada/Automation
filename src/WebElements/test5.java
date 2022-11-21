package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.myntra.com/");
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     
	    WebElement ele = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	    Point loc = ele.getLocation();
	    int x = loc.getX();
       System.out.println("x coordinate "+x);
       int y = loc.getY();
       System.out.println("y coordinates "+y);
       driver.close();

	}

}
