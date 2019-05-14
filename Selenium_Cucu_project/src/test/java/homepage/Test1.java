package homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	@Given("^user is on ogin page$")
	public void user_is_on_ogin_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "J:\\all in one desktop\\uselenium\\chromedriver\\chromedriver.exe");

	   WebDriver driver= new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   System.out.println(driver.getTitle());
		System.out.println("Given");
	   
	}

	@When("^user enter username and passowrd$")
	public void user_enter_username_and_passowrd() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When");
	   
	}
	
	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("and");
	   
	}
	
	@Then("^user should be able to see the title of the page$")
	public void user_should_be_able_to_see_the_title_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then");
	   
	}

	
}
