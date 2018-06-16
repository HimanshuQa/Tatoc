/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author HIM
 */
public class Third_drag {
    
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIM\\Desktop\\chromedriver_win32\\chromedriver.exe");
    
    
    WebDriver web = new ChromeDriver();
    Actions actions = new Actions(web);

    web.get("http://10.0.1.86/tatoc/basic/drag");
    WebElement element = web.findElement(By.id("dropbox")); // get dropbox
    WebElement drag = web.findElement(By.id("dragbox")); // get dragbox
    actions.dragAndDrop(drag, element); 
    actions.build().perform();
    web.findElement(By.cssSelector("a")).click();
    

  
    }
    
    
}
