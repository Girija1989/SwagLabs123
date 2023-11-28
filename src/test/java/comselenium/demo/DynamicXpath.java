package comselenium.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	@Test
	public void xpath_test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		//basic xpath
		//driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		driver.findElement(By.xpath("(//li[@class='nav-item'])[7]")).click();
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("lukthika");
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("12345678");
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		//contains xpath
		driver.findElement(By.xpath("//*[contains(@id,'itemc')]"));
		//starts with
		driver.findElement(By.xpath("//a[starts-with(@class,'list')]"));
		//By using OR
		driver.findElement(By.xpath("//a[@id='itemc' or @class='list-group-item']"));
		//by using AND
		driver.findElement(By.xpath("//a[@id='cartur' and @class='nav-link']"));
		//by using the text()
		driver.findElement(By.xpath("//a[@class='nav-link']"));
		//by using single attribute
		driver.findElement(By.xpath("//a[@id='itemc']"));
		//by using multiple attributes
		driver.findElement(By.xpath("//a[@id='itemc'][@class='list-group-item']"));
		//by using last
		driver.findElement(By.xpath("(//a[@id='signin2'])[last()]"));
		//by using position
		driver.findElement(By.xpath("(//li[@class='nav-item'])[1]"));
		// by using index
		WebElement t =driver.findElement(By.xpath("(//ul[@class='navbar-nav ml-auto']/li[3])"));
		t.getText();
		//by using preceding
		driver.findElement(By.xpath("//div[@class='modal-content']//preceding::input")).getText();
		//by using following sibling
		driver.findElement(By.xpath("(//li[@class='nav-item active']/following-sibling::li[2])")).getText();
		
		
	}

}
