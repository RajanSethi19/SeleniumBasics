package Action_class_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_MKT_Website {

	public static void main(String[] args) throws InterruptedException {
		// WAP to Drag postman to drop zone

		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.xpath("//div[@id=\"container-6\"]//img"));
		Thread.sleep(3000);
		WebElement e2= driver.findElement(By.xpath("//div[@id=\"div2\"]"));
		Thread.sleep(3000);
		Actions a= new Actions(driver);
		a.dragAndDrop(e1, e2).perform();
		
		
	}

}
