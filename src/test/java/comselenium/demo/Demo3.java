package comselenium.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void webDriverEx() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_dropdown']")).click();
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select slt = new Select(element);
		element.click();
		slt.selectByVisibleText("Selenium");
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		element.click();
		WebElement webMenu =driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		webMenu.click();
		String str="India";
		 List<WebElement> web =driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		 System.out.println("No.of Countries are:"+web.size());
		for(WebElement ele :web) {
			if(ele.getText().equals(str)) {
				ele.click();
			}
		}
		WebElement webelm =driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
		webelm.click();
		String strg ="Chennai";
		 List<WebElement> city =driver.findElements(By.xpath("//ul[@id='j_idt87:city_items']/li"));
		 System.out.println("No.of Countries are:"+city.size());
		for(WebElement elem :city) {
			if(elem.getText().equals(strg)) {
				elem.click();
			}
		}
		WebElement webelmn =driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
		webelmn.click();
		String strgs ="Chennai";
		 List<WebElement> course =driver.findElements(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[2]/li"));
		 System.out.println("No.of Countries are:"+course.size());
		for(WebElement elemn :course) {
			if(elemn.getText().equals(strgs)) {
				elemn.click();
			}
		}
		WebElement webelms =driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']"));
		webelms.click();
		
		
		
		
		
		

		
	}

}
