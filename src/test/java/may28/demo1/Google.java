package may28.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        System.setProperty("WebDriver.driver.chrome","/usr/bin/google-chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div[1]/div[1]/h2/a[1]")).click();


    }
}
