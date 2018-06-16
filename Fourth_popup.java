/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacto;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author HIM
 */
public class Fourth_popup {
 
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIM\\Desktop\\chromedriver_win32\\chromedriver.exe");
    
    
    WebDriver web = new ChromeDriver();

    web.get("http://10.0.1.86/tatoc/basic/windows#");
    String parentWindowHandler = web.getWindowHandle(); // Store your parent window

    web.findElement(By.cssSelector("a")).click();
    String subWindowHandler = null;

    Set<String> handles = web.getWindowHandles(); // get all window handles
    System.out.println(handles);
    Iterator<String> iterator = handles.iterator();
    while (iterator.hasNext()){
    subWindowHandler = iterator.next();
    }
    web.switchTo().window(subWindowHandler); // switch to popup window
    web.findElement(By.id("name")).sendKeys("qainfoeh");
    web.findElement(By.id("submit")).click();

// Now you are in the popup window, perform necessary actions here

    web.switchTo().window(parentWindowHandler);  // switch back to parent window
    web.findElements(By.cssSelector("a")).get(1).click();
    
  
    }
}
