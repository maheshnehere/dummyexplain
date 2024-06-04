package may28.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Javat {
    public static void main(String[] args) {
        System.setProperty("WebDriver.driver.chrome","/usr/bin/google-chrome");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://the-internet.herokuapp.com/");

        String title = driver1.getTitle();
        System.out.println(title);

        driver1.findElement(By.xpath("//a[normalize-space()='A/B Testing']")).click();
        driver1.navigate().back();

        driver1.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']")).click();

        boolean heading3 = driver1.findElement(By.xpath("//h3[normalize-space()='Add/Remove Elements']")).isDisplayed();
        boolean heading4 = driver1.findElement(By.xpath("//h3[normalize-space()='Add/Remove Elements']")).isEnabled();
        String headingname = driver1.findElement(By.xpath("//h3[normalize-space()='Add/Remove Elements']")).getText();
        System.out.println(heading3);
        System.out.println(heading4);
        System.out.println(headingname);

        //Add Elements
        driver1.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
        driver1.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
        //Delete elements
        driver1.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
        driver1.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
        driver1.navigate().back();

        //Basic auth
//        driver1.findElement(By.xpath("//a[normalize-space()='Basic Auth']")).click();

        //Set the username
        String username = "admin";

        //Set the password
        String password = "admin";

        String URL = "https//"+username+":"+password+"@"+"https://the-internet.herokuapp.com/basic_auth";
        driver1.get(URL);

        driver1.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        String Title1  = driver1.getTitle();

        System.out.println("The title of page is "+Title1);

        String text = driver1.findElement(By.tagName("p")).getText();

        System.out.println("The test present in page is ==> "+text);


    }
}
