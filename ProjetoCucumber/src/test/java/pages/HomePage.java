package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static runners.RunCucumberTest.driver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("https://qazando.com.br/curso.html");
        Assert.assertEquals(true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preenhceEmail() {
        driver.findElement(By.id("email")).sendKeys("guilhermebrisighello@hotmail.com");
    }

    public void clickGanharDesconto() {
        driver.findElement(By.id("button")).click();
    }

    public void verificarCupomDesconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("QAZANDO15OFF", texto_cupom);
    }

    public void clickVerCursos() {
        driver.findElement(By.id("btn-ver-cursos")).click();
    }

    public void clickVerMais() {
        driver.findElement(By.cssSelector("#cursos > div:nth-child(3) > a")).click();
    }

}
