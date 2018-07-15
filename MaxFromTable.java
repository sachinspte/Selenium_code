package webtable;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Get Maximum of all the Values in a Column of Dynamic Table
public class MaxFromTable {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "S://SeleniumWork//Test//chromedriver.exe");		
		WebDriver driver;
		driver=new ChromeDriver();	
		driver.get("https://money.rediff.com/gainers/bsc/dailygroupa?");	
		driver.manage().window().maximize();
		String max;
	    double m=0,r=0;
	    
		//No.of Columns	
		List<WebElement> noOfCol=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));	
		System.out.println(noOfCol.size());
		
		//No.of Rows	
	    List<WebElement> noOfRows=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]"));	
		System.out.println(noOfRows.size());
		
		for(int i=1;i<noOfRows.size();i++)
		{
			 max=driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
			 NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
				
		}
		

	}


