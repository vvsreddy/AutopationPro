package interveiws_scenarios;

import java.util.List;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selection_Elements {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AH05525\\OneDrive - Anthem\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();  
		
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofMillis(4000));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select")));
		WebElement select =driver.findElement(By.xpath("//select"));
		Thread.sleep(5000);
		//List<WebElement> ele = driver.findElements(By.xpath("//div[@style='display: block !important;']/div"));
		Dimension num= select.getSize();
		
		//System.out.println(num);
		Select sc= new Select(select);
		List<WebElement> elements=sc.getOptions();
		
		for(int i=0;i<elements.size();i++) {
		
		System.out.println(elements.get(i).getText());
		if(elements.get(i).getText().equalsIgnoreCase("India")) {
			
			//sc.selectByVisibleText("India");
			
			elements.get(i).click();
		}
		
		}

}}
