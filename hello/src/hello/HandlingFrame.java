
package hello;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrame {
 public static void main(String[] args) {
  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("https://www.indeed.com");
  String Title = driver.getTitle();
  System.out.println("Title is " + Title);
  driver.close();
  //Focus on topwindow
 // driver.get("http://www.rediff.com/");
//  driver.switchTo().frame("moneyiframe");
 // driver.findElement(By.id("query")).sendKeys("TCS");
 // driver.findElement(By.className("mw001-widget-getquote-btn")).submit();
 // driver.switchTo().defaultContent();
  

 }
}

