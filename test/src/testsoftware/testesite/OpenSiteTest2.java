package testesite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class OpenSiteTest {
	
	//difinir variavel driver
	private WebDriver driver;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\47127512021.1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2500);
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(1500);
		driver.quit();
		
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://75c7-2804-14d-5c71-8c83-f569-396e-c010-2824.sa.ngrok.io/ProjetoCurso/");
		assertTrue(driver.getTitle().contentEquals("MGLsport"));
		
		
		WebElement btnLogin = driver.findElement(By.className("btn-login"));
		btnLogin.click();

		
		Thread.sleep(1000);
		
		WebElement inputEmail = driver.findElement(By.name("email"));
		inputEmail.click();
		inputEmail.sendKeys("andersonmoura812@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement inputPassorwd = driver.findElement(By.name("password"));
		inputPassorwd.click();
		inputPassorwd.sendKeys("050200");
		
		Thread.sleep(1500);
		
		WebElement btnLogar = driver.findElement(By.className("txtbutton"));
		btnLogar.click();
		
		Thread.sleep(1500);
		
		WebElement btnPgPrincipal = driver.findElement(By.className("title"));
		btnPgPrincipal.click();
		
		Thread.sleep(1500);
		
		WebElement btnClase = driver.findElement(By.className("btn"));
		btnClase.click();
		
		Thread.sleep(1500);
		
		WebElement btnProduto = driver.findElement(By.className("product-item"));
		btnProduto.click();
		
		Thread.sleep(1500);
		
		WebElement btnComprar = driver.findElement(By.className("btn-buy"));
		btnComprar.click();
		
		Thread.sleep(1500);
		
		WebElement btnFinalizarCart= driver.findElement(By.className("btn-finish-cart"));
		btnFinalizarCart.click();
		
		Thread.sleep(1500);
		
		WebElement btnFinalizarCompra = driver.findElement(By.className("btn-buy"));
		btnFinalizarCompra.click();
		
		Thread.sleep(8500);
		
		System.out.print("Fim do Teste!!");
	}

}
