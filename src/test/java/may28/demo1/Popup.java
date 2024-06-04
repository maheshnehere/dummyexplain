package may28.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Popup {
    public static void main(String[] args) {
        System.setProperty("WebDriver.driver.chrome","/usr/bin/google-chrome");
        WebDriver driver = new ChromeDriver();
        //Set the username
        String username = "admin";

        //Set the password
        String password = "admin";


        String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        String title = driver.getTitle();

        System.out.println("The page title is "+title);

        String text = driver.findElement(By.tagName("p")).getText();

        System.out.println("The test present in page is ==> "+text);

        driver.close();
        driver.quit();
    }
}
