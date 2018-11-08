package selPural;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMutipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println("Befor use Switch method");
		System.out.println(driver.getTitle());
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println("After use Switch method");
		System.out.println("Child window name: "+driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println("Switch back to parent");
		System.out.println("PArent account: "+driver.getTitle());
		
		
		
		

	}

}
