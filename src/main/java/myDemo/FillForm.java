package myDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

    public static void main(String[] args) {
        //Variables
        String name = "Nombre";
        String surName = "Apellido";
        String mail = "correo@gmail.com";
        String monthDayYear = "12-12-2023";

        //Open form on chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/231013256579354");

        //Fill textboxes: First Name - Last Name - Email
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first_3']"));
        firstName.sendKeys(name);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='last_3']"));
        lastName.sendKeys(surName);

        WebElement email = driver.findElement(By.xpath("//input[@id='input_4']"));
        email.sendKeys(mail);

        //Fill calendar: Fecha
        WebElement date = driver.findElement(By.xpath("//input[@id='lite_mode_8']"));
        date.sendKeys(monthDayYear);

        //Fill radio button: Opción
        WebElement option = driver.findElement(By.xpath("//label[@id='label_input_9_1']"));
        option.click();

        //Fill dropdown: Escriba una pregunta
        //WebElement selection = driver.findElement(By.xpath("//select[@id='input_12']"));
        //selection.click();

        //Fill checkbox: Términos y condiciones
        //WebElement terms = driver.findElement(By.xpath("//input[@id='userInput']"));
        //terms.click();

        WebElement terms = driver.findElement(By.className("iCheck-helper"));
        terms.click();
    }
}
