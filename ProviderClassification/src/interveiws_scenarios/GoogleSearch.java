package interveiws_scenarios;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AH05525\\OneDrive - Anthem\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();  
		//Dimension targetSize = new Dimension(100000, 10000);

		//driver.manage().window().setSize(targetSize);
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("test");
		Thread.sleep(5000);
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		for(int j=0;j<ele.size();j++) {
			String str1=ele.get(j).getText();
			System.out.println(str1);
			
		}
	     
		for(int i=0;i<ele.size();i++) {
			
			String str=ele.get(i).getText();
			
			
			
              if(str.equalsIgnoreCase("test")) {
            	  Thread.sleep(5000);
				ele.get(i).click();
				break;
				}
			
			
			
		}
		
		
	}

}
