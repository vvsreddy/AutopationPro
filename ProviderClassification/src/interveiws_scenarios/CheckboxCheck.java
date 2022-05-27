package interveiws_scenarios;


import java.util.Iterator;
import java.util.List;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxCheck {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AH05525\\OneDrive - Anthem\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   
		driver.get("https://www.w3.org/TR/wai-aria-practices-1.1/examples/checkbox/checkbox-1/checkbox-1.html");
		driver.manage().window().maximize();  
		
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofMillis(4000));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='checkboxes']")));
		List<WebElement> Check =driver.findElements(By.xpath("//ul[@class='checkboxes']/li/div"));	
		
		
		
		//Iterator<WebElement> ele=Check.iterator();
		
		//while(ele.hasNext()) {
		//	System.out.println(ele.next().getText());
		//	if(ele.next().isSelected()) {
				
			//	System.out.println("Selected checked Box");
			//}//else {
				
				//ele.next().click();
			//}
				
		for(int i=0;i<Check.size();i++) {
			
			System.out.println(Check.get(i).getText());
			System.out.println(Check.get(i).isSelected());
			
			 // JavascriptExecutor js = (JavascriptExecutor)driver;
			  //js.executeScript("document.getElementsById('aria-checked').checked=false;");
			//  js.executeScript("document.getElementById('aria-checked').click();");
			
			if(!Check.get(i).isSelected()) {
				Thread.sleep(5000);
				
				
		driver.findElement(By.xpath("//ul[@class='checkboxes']/li["+ (i+1) +"]/div")).click();;
				
		}
				
				
			
			
			
		}
		
		
		
		
				
		}

	}


