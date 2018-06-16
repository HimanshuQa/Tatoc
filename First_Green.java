/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacto;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author HIM
 */
public class First_Green {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIM\\Desktop\\chromedriver_win32\\chromedriver.exe");
    
    
    WebDriver web = new ChromeDriver();
    
    web.get("http://10.0.1.86/tatoc/basic/grid/gate");
    web.findElement(By.className("greenbox")).click(); // click on green box

  
    web.quit();
    }
}
