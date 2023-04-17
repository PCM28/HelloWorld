package myDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

    public static void main(String[] args) throws InterruptedException {
        //Variables
        String name = "Nombre";
        String surName = "Apellido";
        String mail = "correo@gmail.com";
        String monthDayYear = "12-12-2023";

        //Open form on chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/231013256579354");

        //Frame
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='customFieldFrame_17']"));

        //Fill textboxes: First Name - Last Name - Email
        driver.findElement(By.xpath("//input[@id='first_3']")).sendKeys(name);

        driver.findElement(By.xpath("//input[@id='last_3']")).sendKeys(surName);

        driver.findElement(By.xpath("//input[@id='input_4']")).sendKeys(mail);

        //Fill calendar: Fecha
        driver.findElement(By.xpath("//input[@id='lite_mode_8']")).sendKeys(monthDayYear);

        //Fill radio button: Opción
        driver.findElement(By.xpath("//label[@id='label_input_9_1']")).click();

        //Fill dropdown: Escriba una pregunta
        Select dropQuestion = new Select(driver.findElement(By.xpath("//*[@id=\"input_12\"]")));
        dropQuestion.selectByIndex(2);//(1): Opción A, (2): Opción B, (3): Opción C

        //Fill checkbox: Términos y condiciones
        driver.switchTo().frame(frame);

        driver.findElement(By.xpath("//div[@class='icheckbox_minimal']")).click();

        driver.switchTo().defaultContent();

    }
}
