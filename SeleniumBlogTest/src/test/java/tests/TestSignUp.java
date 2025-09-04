package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSignUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://selenium-blog.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("princess3");
        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("princess3@mallinator.com");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("princess");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(Long.parseLong("10000"));
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        Thread.sleep(Long.parseLong("10000"));
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
        Thread.sleep(Long.parseLong("10000"));
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/div/div/li[2]/a")).click();
        Thread.sleep(Long.parseLong("10000"));
        driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a")).click();
        Thread.sleep(Long.parseLong("10000"));
        driver.quit();




    }
}
