package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    driver.manage().window().maximize();
    driver.findElement(By.id("/html/body/div[2]/div/a[1]")).click();


    }
}
