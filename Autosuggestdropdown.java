package date27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdropdown {

	public static void main(String[] args) {
		WebDriver drive=new ChromeDriver();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		drive.get("https://www.google.com/");
		
		drive.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement>list=drive.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(list.size());
		
		for(WebElement li:list) {
			System.out.println(li.getText());
			if(li.getText().equals("selenium")) {
				li.click();	
			}
	
			
		}
	}
}



