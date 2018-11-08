package selPural;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayPageLinksVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exePath = "C:\\Software\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		//find total no of links in the ebay home page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//find total no of links in the footer on ebay home page
		WebElement footer=driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//find totle links in the footer 2nd column
		WebElement col2=driver.findElement(By.xpath("//footer['glbfooter']//div[2]//table//tbody//tr//td[2]/ul"));
		System.out.println(col2.findElements(By.tagName("a")).size());
		
		for(int i=0; i< col2.findElements(By.tagName("a")).size(); i++)
		{
			//printing the name of links in footer section
			//System.out.println(col2.findElements(By.tagName("a")).get(i).getText());
			
			//Clicks on the site map and print the title of header
			if(col2.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				col2.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
		}
		System.out.println(driver.getTitle());
		
		
	}

}
