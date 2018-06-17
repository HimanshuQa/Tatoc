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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author HIM
 */
public class Second_Frame {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIM\\Desktop\\chromedriver_win32\\chromedriver.exe");
    
    WebDriver web = new ChromeDriver();
    web.get("http://10.0.1.86/tatoc/basic/frame/dungeon");
    web.switchTo().frame("main");
    String box1 = web.findElement(By.id("answer")).getAttribute("class");// get first box color
    
    while(true){
            
            web.findElement(By.cssSelector("a")).click(); //click on repaint box 2
            web.switchTo().frame("child"); //goto child fram for box2
            String box2 = web.findElement(By.id("answer")).getAttribute("class");// get second box color
            web.switchTo().parentFrame(); //goback to parent form for repainting box
            if(box1.equals(box2))
            {
                web.findElements(By.cssSelector("a")).get(1).click(); //clicking on proceed
                break;
            }
        
            
        }
    }
}
