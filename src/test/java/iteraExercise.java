import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class iteraExercise {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        driver.findElement(By.id("name")).sendKeys("John Wick");
        driver.findElement(By.id("phone")).sendKeys("4423563635");
        driver.findElement(By.id("email")).sendKeys("johnwick@gmail.com");
        driver.findElement(By.id("password")).sendKeys("asdfwwgdd");
        driver.findElement(By.id("address")).sendKeys("Wall street 2 - 196, New-York, USA");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.id("male")).click();
        driver.findElement(By.id("tuesday")).click();
        driver.findElement(By.id("friday")).click();
        Select dropdown = new Select(driver.findElement(By.className("custom-select")));
        dropdown.selectByVisibleText("Norway");
        driver.findElement(By.xpath("//*[@for='2years']")).click();
        driver.findElement(By.xpath("//*[@for='selenium']")).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}
