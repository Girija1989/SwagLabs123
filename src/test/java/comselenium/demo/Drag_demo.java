package comselenium.demo;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_demo {
	@Test
	public void webDriverEx() {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement browser=driver.findElement(By.xpath("//li[@id='menuform:j_idt39']"));
		WebElement drag=driver.findElement(By.xpath("//li[@id='menuform:m_drag']"));
		act.moveToElement(browser).click().build().perform();
		act.moveToElement(drag).click().build().perform();
		//act.moveToElement(browser).moveToElement(drag).click().build().perform();//it is used in single statement
		
		//Draggable Columns
		WebElement source =driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt95']"));
		WebElement target =driver.findElement(By.xpath("//th[@id='form:j_idt94:j_idt97']"));
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).build().perform();//it is used in single statement
		
		//Draggable Rows
		WebElement sources =driver.findElement(By.xpath("(//tr[@class='ui-widget-content ui-datatable-even'])[3]"));
		WebElement targets =driver.findElement(By.xpath("(//tr[@class='ui-widget-content ui-datatable-odd'])[9]"));
		//act.dragAndDrop(sources, targets).build().perform();//it is used in single statement
		act.clickAndHold(targets).moveToElement(sources).release().build().perform();
		
		//Range Slider
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/div"));
		act.dragAndDropBy(slider, 60, 0).build().perform();
		
		//Droppable
		WebElement w =driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		WebElement t =driver.findElement(By.xpath("//div[@id='form:drag']"));
		act.clickAndHold(t).moveToElement(w).release().build().perform();
		
		//Draggable
		WebElement tr =driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		act.dragAndDropBy(tr, 300, 175).build().perform();
		
		//Progress Bar
		WebElement brs=driver.findElement(By.xpath("//button[@id='form:j_idt119']"));
		act.moveToElement(brs).click().build().perform();
		
		//resize image
		WebElement we=driver.findElement(By.xpath("//div[@class='card'])[4]"));
		driver.switchTo().frame(we);
		WebElement web=driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-e']"));
//	 point = web.getLocation();
//	int x =  (int) point.getX();
//	int y = (int) point.getY();
		act.dragAndDropBy(we, 50, 10).build().perform();
	}

		
	}

		/*@Test
		public void webDriverExp() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			Actions act = new Actions(driver);
			WebElement right =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			act.contextClick(right).build().perform();
		}*/


