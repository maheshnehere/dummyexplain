package may28.demo1;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Brokenimages {
    WebDriver driver2;

    public void chromeSetup(){
        System.setProperty("WebDriver.driver.chrome","/usr/bin/google-chrome");
       driver2 = new ChromeDriver();
        driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver2.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }

    @Test
    public void testlinks(){
        chromeSetup();
        driver2.get("https://the-internet.herokuapp.com/");
        driver2.findElement(By.xpath("//a[normalize-space()='Broken Images']")).click();
        List<WebElement> images = driver2.findElements(By.tagName("img"));
        images.forEach(name -> System.out.println(name.getAttribute("src")));
        System.out.println("Total number of links:::"+ images.size());
}


    public static void main(String[] args) {

    }
}

