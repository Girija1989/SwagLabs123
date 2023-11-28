package comselenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaits1WithMethodPrameter {

	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();

			// To load the page by using pageloadtimeout:
					  //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
					  driver.get("https://www.saucedemo.com/");
					 WebElement username= driver.findElement(By.name("user-name"));
					  WebElement password=driver.findElement(By.name("password"));
					  WebElement login=driver.findElement(By.name("login-button"));
					  sendKeys(driver,username,10,"standard_user");
					  sendKeys(driver,password,10,"secret_sauce");
					  click(driver,login,10);
					  WebElement addtocart=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
					  click(driver,addtocart,10);
					  WebElement viewcart=driver.findElement(By.id("shopping_cart_container"));
					  click(driver,viewcart,10);
					  WebElement checkout=driver.findElement(By.id("checkout"));
					  click(driver,checkout,10);
					  WebElement firstname= driver.findElement(By.name("firstName"));
					  WebElement lastName=driver.findElement(By.name("lastName"));
					  WebElement zipcode=driver.findElement(By.name("postalCode"));
					  WebElement continue1=driver.findElement(By.name("continue"));
					  sendKeys(driver,firstname,10,"chithra");
					  sendKeys(driver,lastName,10,"lekha");
					  sendKeys(driver,zipcode,10,"517507");
					  click(driver,continue1,10);
					  WebElement finish=driver.findElement(By.name("finish"));
					  click(driver,finish,10);
					  WebElement backtohome=driver.findElement(By.name("back-to-products"));
					  click(driver,backtohome,10);
					  WebElement backtohome1=driver.findElement(By.id("react-burger-menu-btn"));
					  click(driver,backtohome1,10);
					  WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
					  click(driver,logout,10);
	
					}
	
				
				public static void sendKeys(WebDriver driver,WebElement element, int timeout,String value ) {
					new WebDriverWait(driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
					element.sendKeys(value);
					
			}
			public static void click(WebDriver driver,WebElement element, int timeout ) {
					new WebDriverWait(driver,Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
					element.click();
				


	}

}
