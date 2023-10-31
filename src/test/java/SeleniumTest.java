import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\user\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("kalani herath");


        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("kalani@gmail.com");

        WebElement addressField = driver.findElement(By.id("textarea"));
        addressField.sendKeys("sumangala mawatha, wariyapola");

        WebElement phoneField = driver.findElement(By.id("phone"));
        phoneField.sendKeys("0759864501");


        driver.findElement(By.cssSelector("input[value='female']")).click();

    }
    }

