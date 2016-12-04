package testesfuncionais.dsl;

import org.omg.CORBA.StringHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
public class Base {
    public static WebDriver driver = null;
    public static WebDriverWait wait;

    public Base(){
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void escrever(String name, String texto) {
        driver.findElement(By.name(name)).sendKeys(texto);
    }

    public String obterTexto(String element){
        return driver.findElement(By.cssSelector(element)).getText();
    }

    public String obterValor(String element){
        return driver.findElement(By.xpath(element)).getAttribute("value");
    }

    public void  clicarId (String id){
        driver.findElement(By.id(id)).click();
    }

    public void  clicarCssSelector(String element){
        driver.findElement(By.cssSelector(element)).click();
        }

    public void  clicarLink (String element){
        driver.findElement(By.linkText(element)).click();
    }

    public void  clicarName (String element){
        driver.findElement(By.name(element)).click();
    }
    public void waitrById(String id){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    public void waitrByName(String name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
    }

    public void waitrByCssSelector(String element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
    }

    public void waitrByLink(String link){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(link)));
    }

    public void waitrByXpath(String element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }




}
