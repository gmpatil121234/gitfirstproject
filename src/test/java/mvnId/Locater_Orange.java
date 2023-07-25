package mvnId;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locater_Orange {
	
	
	public static void  main (String [] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
    /*  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
      
   
      
      driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
      driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
      driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
  */
      
      driver.get("https://book.spicejet.com/search.aspx");
     driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
      driver.findElement(By.xpath("//a[text()=' Pune (PNQ)']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[text()=' Goa (GOI)']")).click();
	}
	
	

}
