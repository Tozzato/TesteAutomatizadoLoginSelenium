// Gabriel Tosato Pires 
// 22/05/2019
// Teste feito em selenium
// Levando em consideração que a maquina já possui o browser Firefox

package Valido;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste{
	
	public static void main(String[]args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.submarino.com.br/");
		driver.manege().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("EmailValido");
		driver.findElement(By.id("Password")).sendKeys("SenhaValido");
		driver.findElement(By.id("Continuar")).click();
		
		//validação de caso
			if (driver.findElement(By.linkText("Logoff".isDisplayed()==true) {
				System.out.println("Login positivo - Passed");
			}else {
				System.out.println("Login positivo - Failed");
	}
}

