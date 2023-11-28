package comselenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EToECases {

	//public static void main(String[] args) {
	@Test
	public void method() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]")).click();
	driver.findElement(By.xpath("(//a[@class='see-all'])[2]")).click();
	driver.findElement(By.xpath("(//div[@class='image'])[1]")).click();
	driver.findElement(By.xpath("//button[@id='button-cart']")).click();
//	driver.findElement(By.xpath("(//i[@class='fas fa-shopping-cart'])[1]")).click();
//	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//	driver.findElement(By.xpath("(//div[@class='content'])[3]")).click();
//	driver.findElement(By.xpath("//input[@id='input-option-value-6']")).click();
//	driver.findElement(By.xpath("//input[@id='input-option-value-9']")).click();
//	driver.findElement(By.xpath("//input[@id='input-option-208']")).clear();
//	driver.findElement(By.xpath("//input[@id='input-option-208']")).sendKeys("Hello");
//	driver.findElement(By.xpath("//input[@id='input-option-value-9']")).click();
//	WebElement webelm =driver.findElement(By.xpath("//select[@id='input-option-217']"));
//	webelm.click();
//	String strg ="Blue\r\n"
//			+ "(+$5.60)";
//	 List<WebElement> color =driver.findElements(By.xpath("//select[@id='input-option-217']"));
//	 System.out.println("No.of Countries are:"+color.size());
//	for(WebElement elem :color) {
//		if(elem.getText().equals(strg)) {
//			elem.click();
//		}
//	}
//	
//	
//	

	}

}
