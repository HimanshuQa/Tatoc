/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacto;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.name;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author HIM
 */
public class AddCookie {
    
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIM\\Desktop\\chromedriver_win32\\chromedriver.exe");
    
    
    WebDriver web = new ChromeDriver();
    
    web.get("http://10.0.1.86/tatoc/basic/cookie#"); // to cookie page 
    
    
    int n=1;
    while(n>0){
        try {
            web.findElement(By.cssSelector("a")).click(); //click on generate token
            String value = web.findElement(By.id("token")).getText().split("Token: ")[1];    // get tokenn value
            n=0; // break the loop
        } catch (Exception e) {
            System.out.println(e);
            web.navigate().refresh(); //refresh page if generate token doesnot give result
        }
    }
    
    String value = web.findElement(By.id("token")).getText().split("Token: ")[1]; // get tokenn value
    web.manage().addCookie( new Cookie("Token", value, "/")); //add cookie
    web.findElements(By.cssSelector("a")).get(1).click(); //click on proceed

  

    }
}
