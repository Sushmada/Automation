package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

}
