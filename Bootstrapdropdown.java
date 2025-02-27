package date27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	         
	        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	        driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle btn btn-default')]")).click();
	        
	        
	        //select single option
	        driver.findElement(By.xpath("//input[@value='Java']")).click();
	        
	      List<WebElement>options=driver.findElements(By.xpath("//ul//label"));
           System.out.println(options.size());
           
         /*  for(WebElement op:options) {
        	   System.out.println(op.getText());
           } */
           
           //select multiple options
           for(WebElement op:options) {
        	  String option=op.getText();
        	 if(option.equals("Python")||(option.equals("MySQL")) || (option.equals("Oracle"))){
        		 op.click();
        	 }
           }
	}

}
