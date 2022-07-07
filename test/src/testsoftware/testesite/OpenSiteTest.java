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
		Thread.sleep(1500);
	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(1500);
		driver.quit();
		
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://google.com");
		assertTrue(driver.getTitle().contentEquals("Google"));
		
		
		WebElement cxbusca = driver.findElement(By.name("q"));
		cxbusca.click();
		cxbusca.sendKeys("notebook");
		
		Thread.sleep(1500);
		
		WebElement btbusca = driver.findElement(By.name("btnK"));
		btbusca.click();
		
		Thread.sleep(1500);
		
		System.out.print("Fim do Teste!!");
	}

}
