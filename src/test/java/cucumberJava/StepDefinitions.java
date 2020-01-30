package cucumberJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver = null;
	List<WebElement> listOfElements = null;

	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() throws Throwable {
		// Path of the chrome driver location
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ps5052013\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();

		System.out.println("open chrome");
	}

	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Throwable {

		driver.navigate().to("https://www.google.com/");

		System.out.println("open google page");
	}

	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
		// Path of the search tab in google home page
		listOfElements = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));

		if (!listOfElements.isEmpty()) {
			System.out.println("Test \"check search box\" Pass");
		} else {
			System.out.println("Test \"check search box\" Fail");
		}
		
		listOfElements.clear();
	}

	@Then("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Throwable {
		// Path of the search button in google home page
		listOfElements = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
		
		if (!listOfElements.isEmpty()) {
			System.out.println("Test \"check search button\" Pass");
		} else {
			System.out.println("Test \"check search button\" Fail");
		}
		
		listOfElements.clear();
	}

	@Then("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Throwable {
		// Path of the i'm feeling lucky button in google home page
		listOfElements = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]"));
		
		if (!listOfElements.isEmpty()) {
			System.out.println("Test \"check i'm feeling button\" Pass");
		} else {
			System.out.println("Test \"check i'm feeling button\" Fail");
		}
		
		listOfElements.clear();
		//driver.close();
	}

}
