package selPural;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exePath = "C:\\Software\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		//find how many i frames are in the web page
		System.out.println(driver.findElements(By.id("iframe")).size());
		driver.switchTo().frame(0);
		
		//defining web elements
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		//perform drag and drop
		a.dragAndDrop(source, target).build().perform();
		
		//moving out of iframe
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		
		
		

	}

}
