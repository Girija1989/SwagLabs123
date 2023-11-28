package comselenium.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TextBox {
	@Test
	public void webDriverExample() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("menu-button")).click();
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_input']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Girija");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("  " +"Tirupati");
        driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isDisplayed();
	    if(driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isDisplayed()==true) {
			  System.out.println("I am Disabled State");
		  }
		//driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).clear();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("girija.keerthipati@gmail.com");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("This is Girija,from tirupati");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Used in Testing.");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys("Enter");
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).sendKeys("super");
		driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("Chithra");
		driver.findElement(By.id("j_idt106:auto-complete_hinput")).sendKeys("2");
		driver.findElement(By.id("j_idt106:j_idt116_input"));
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("24-6-1989");
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']")).click();
		driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-up ui-corner-tr ui-button ui-widget ui-state-default ui-button-text-only']")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("70");
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).sendKeys("Keyboard Confirmed");
		
		
		

		 
		  }

	}


