package date27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jdk.jfr.internal.Options;

public class SelectDropdowns {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().window().maximize();
	        
	        WebElement Drpcntele=driver.findElement(By.xpath("//select[@id='country']"));
	        Select Drpcnt=new Select(Drpcntele);
	        
	     //   Drpcnt.selectByVisibleText("France");
	      //  Drpcnt.selectByValue("uk");
	      // Drpcnt.selectByIndex(4);
	        
	      List<WebElement>options=Drpcnt.getOptions();
	        System.out.println(options.size());
	        
	      /* for(int i=0; i<options.size();i++) {
	    	   System.out.println(options.get(i).getText());
	       }*/
	       
	       //enchanced for loop
	       for(WebElement op:options) {
	    	   System.out.println(op.getText());
	       }
	        

	}

}
