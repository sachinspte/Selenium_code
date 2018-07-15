package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Fetch number of rows and columns from Dynamic WebTable
   public class Noofrowsandcols {	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "S://SeleniumWork//Test//chromedriver.exe");
	
	WebDriver driver;
	
	driver=new ChromeDriver();	
	driver.get("https://money.rediff.com/gainers/bsc/dailygroupa?");	
	driver.manage().window().maximize();
	
	//No.of Columns	
	List<WebElement> noOfCol=driver.findElements(By.xpath("//table/thead/tr/th"));	
	System.out.println(noOfCol.size());
	
	//No.of Rows	
    List<WebElement> noOfRows=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));	
	System.out.println(noOfRows.size());
	
	
	}

}
