package se.koarito.tdd.slutproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebbTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.msn.com/sv-se");

        Thread.sleep(3 * 1000);

        WebElement searchBox = driver.findElement(By.id("q"));
        searchBox.sendKeys("Stockholms Tekniska Institut");
        WebElement searchButton = driver.findElement(By.id("sb_form_go"));
        searchButton.click();
        WebElement searchBox2 = driver.findElement(By.name("q"));
        System.out.println(searchBox2.getAttribute("value"));
        WebElement info = driver.findElement(By.className("b_factrow"));
        System.out.println(info.getText());

    }
}
