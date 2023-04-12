package myDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWord {

    public static void main(String[] args) {
        //Variable
        String palabra = "Solera";

        //Open Google
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        //Decline Cookies
        WebElement buttonRechazarTodo = driver.findElement(By.id("W0wltc"));
        buttonRechazarTodo.click();

        //Find Word
        WebElement buscador = driver.findElement(By.className("gLFyf"));
        buscador.sendKeys(palabra);

        //Click on search
        WebElement buttonBuscar = driver.findElement(By.className("gNO89b"));
        buttonBuscar.submit();

        //Show the amount on console
        System.out.println("Número de veces que se repite la palabra " +palabra+": "+ driver.findElements(By.xpath("//*[contains(text(),'Solera') or contains(text(),'solera')]")).size());

    }
}
