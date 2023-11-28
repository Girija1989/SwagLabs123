package comselenium.demo;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestCase {
	@Test
	public void webDriverEx() throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/customer-account-login");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement men =driver.findElement(By.xpath("//a[text()='Men']"));
		act.moveToElement(men).build().perform();
		WebElement women =driver.findElement(By.xpath("//a[text()='Women']"));
		act.moveToElement(women).build().perform();
		WebElement kids =driver.findElement(By.xpath("//a[text()='Kids']"));
		act.moveToElement(kids).build().perform();
		WebElement home =driver.findElement(By.xpath("//a[text()='Home & Living']"));
		act.moveToElement(home).build().perform();
		WebElement beauty =driver.findElement(By.xpath("//a[text()='Beauty']"));
		act.moveToElement(beauty).build().perform();
		WebElement men1 =driver.findElement(By.xpath("//a[text()='Men']"));
		act.moveToElement(men1).build().perform();
		act.moveToElement(men1).click().build().perform();
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,-2000)");
		options.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//label[@class='common-customRadio gender-label undefined']")).click();
		//for women
    	//driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
//		WebElement ele =driver.findElement(By.xpath("//input[@class='filter-search-inputBox']"));
//		ele.sendKeys("shirts");
//		ele.click();
//		driver.findElement(By.xpath("(//input[@value='799.0 TO 1859.0'])[1]")).click();
//		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[13]")).click();
//		driver.findElement(By.xpath("(//input[@value='10.0 TO 100.0'])[1]")).click();

}
}
