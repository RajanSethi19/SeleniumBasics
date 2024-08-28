package Action_class_Functions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Mkt_DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().forward();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().forward();
		driver.navigate().to("https://www.myntra.com/");

	}

}
