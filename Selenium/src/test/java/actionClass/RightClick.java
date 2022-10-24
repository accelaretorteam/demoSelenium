package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/browserdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(searchbox).perform();
		
		
		

	}

}
