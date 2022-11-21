package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {


	public static void main(String[] args) throws FileNotFoundException, IOException {
	      Properties p=new Properties();
	      FileInputStream fis=new FileInputStream("./data.properties");
	      p.load(fis);
	      
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get(p.getProperty("url"));
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	      driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
	      driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
	      

		
				
	}

}
