package may28.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    WebDriver driver;

    public void setgoogle()
    {
        System.setProperty("WebDriver,driver,chrome","/usr/bin/google-chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public void login()
    {
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }


}
