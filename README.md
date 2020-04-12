# Selenium WebDriver with Java - Basics to Advanced& Interview

## Chapter 5  

### 5.1 Importance of Locator Identifiers in Selenium 
Selenium recognizes all the objects in the web with the locators. With the help of locators selectinum intracts with your browser actions. 
Locators supported by Selenium Webdriver:
1. ID 
2. ClassName
3. Name
4. LinkText
5. Xpath
6. Css 

Example: 
driver.findElement(By.id("email")).sendKeys("isuru@gmail.com"); 
There may not be an ID or name for each element. In that case we can use Xpath and CSS.


### How to Become Genius in XPath in Selenium - Session -18 

1. Go to the site which you want to automate. 
2. Go to inspect element of username. 
3.Press Ctrl F in windows/Command F in mac.
4. Enter // on the Finder.
5. Enter the tag name of the username.
6. It will highlight the matching section in html doc when u write xpath.
7. You have correctly identifed the element If the finder is displaying 1 of 1 for relevent tag name/section of the xpath.

Example:
//input[@name='username']


You can user multiple parameters if you can't uniquely identify an element using one parameter. You can do it using the "and" operator. 
Examle: 
button 
//input[@type='submit' and @value='Login'] 
//button[contains(text(),'Login')]
//div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']


Link(link name contains 'features' text), 
//a[text()='features'] 
//a[contains(text(),'features')] 

Checkbox, 
//*[@class="ui celled sortable striped table custom-grid table-scroll"]/tbody/tr[2]/td[2] 
click on a checkbox,
//table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody/tr[2]//input[@name='id'].click();

#### How to handle dynamic IDs  
You can use "Contains" ,"starts with()" and "ends-with" methods to find dynamic IDs. 

Examples: 
driver.findElement(By.xpath(//input[contains(@id,'test_')])).sendKeys(); 
driver.findElement(By.xpath(//input[start-with(@id,'test_')])).sendKeys(); 
driver.findElement(By.xpath(//input[ends-with(@id,'_test')])).sendKeys(); 

#### Cutomized xpaths for links 
//a[contains(text(),'Sign in')] 
 
### driver.findElements 

you can use this when u need to count(tot) the numbers of elements present in a site. 


