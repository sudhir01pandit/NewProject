package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class angular {

	public static void main(String[] args) {
		System.setProperty("chromedriver", "usr/local/bin");
		WebDriver driver = new ChromeDriver();
                driver.get("http://juliemr.github.io/protractor-demo/");
                NgWebDriver ngDriver = new NgWebDriver((JavascriptExecutor) driver);
                ngDriver.waitForAngularRequestsToFinish();
                driver.findElement(ByAngular.model("first")).sendKeys("2");
                driver.findElement(ByAngular.model("second")).sendKeys("2");
                driver.findElement(ByAngular.buttonText("Go!")).click();
                driver.findElement(By.id("dsfsd")).click();
        }

}
