package selPural;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exePath = "C:\\Software\\geckodriver-v0.23.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath);
		
		WebDriver driver=new FirefoxDriver();
		WebDriverWait d=new WebDriverWait(driver,5);
		
		//Implicite Wait- This is applicable for all steps
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.alaskaair.com/content/vacations/packages");
		driver.findElement(By.id("navBook")).click();
		driver.findElement(By.id("navBookHotels")).click();
		d.until(ExpectedConditions.elementToBeClickable(By.id("H-destination")));
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		//Explicite wait. This is only applicablre to "d." steps only.
		//WebDriverWait d=new WebDriverWait(driver,5);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='807655']/div[2]/div[1]/a")));
		driver.findElement(By.xpath("//*[@id='807655']/div[2]/div[1]/a")).click();
		
		
		

	}

}
