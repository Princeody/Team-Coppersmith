import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSetup {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://selenium-blog.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("/html/body/div[2]/div/a[1]")).click();
    }
}
