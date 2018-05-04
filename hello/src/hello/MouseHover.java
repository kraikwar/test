package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
 
 public static void main(String[] args) {
  
  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
  FirefoxDriver driver = new FirefoxDriver();
  driver.get("file:///C:/selenium/ActionsEx.html");
  
  //Handling mouse action we need to use Actions Class
  Actions action = new Actions(driver);
  
  action.moveToElement(driver.findElement(By.xpath(".//*[starts-with(@id,'menu')]/div[text()='Search Engine']")));   //moveToElement is mouse Hover
  action.moveToElement(driver.findElement(By.xpath(".//*[@id='menu1choices']/a[text()='Google']")));
  action.click();
  
  //mouse action to be invoked we have to call perform method mandatorily
  action.perform();
 }

}
