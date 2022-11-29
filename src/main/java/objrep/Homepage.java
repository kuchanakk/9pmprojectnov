package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	static WebDriver driver;
	
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public  WebElement popitem() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
		
	}
	
	public  WebElement tablink() {
		
		return driver.findElement(By.id("details_16"));
		
	}
	
	public  WebElement laplink() {
		
		return driver.findElement(By.id("details_10"));
		
	}
	
	public  WebElement spklink() {
		
		return driver.findElement(By.id("details_21"));
		
	}
	
	
}
