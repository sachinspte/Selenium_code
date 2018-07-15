package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Fetch cell value of a particular row and column of the Dynamic Table
public class RowandCell {
	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S://SeleniumWork//Test//chromedriver.exe");		
		WebDriver driver;		
		driver=new ChromeDriver();	
		driver.get("https://money.rediff.com/gainers/bsc/dailygroupa?");	
		driver.manage().window().maximize();
		
		//To find third row and second column of table		
		WebElement 	tableRow=driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));		
		System.out.println(tableRow.getText());

		//Printing 3rd Row
		WebElement thirdRow=driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]"));		
		System.out.println(thirdRow.getText());
				
		
	}

}
