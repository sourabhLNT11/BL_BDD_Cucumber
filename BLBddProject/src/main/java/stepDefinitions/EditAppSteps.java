package stepDefinitions;

import Base.TestBase;
import Pages.GeneralInformationPage;
import Pages.LacaptialeLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class EditAppSteps extends TestBase{
	
	LacaptialeLoginPage loginpage = new LacaptialeLoginPage(driver);
	GeneralInformationPage genPage = new GeneralInformationPage(driver);
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
	    System.out.println("In Given function");
	    Thread.sleep(10000);
		loginpage.enterUserName("dev@breathelife.com");
		loginpage.enterPassword("9Lf06$9^GQox");
		loginpage.clickLoginButton();

	   
	}
	@When("user is able to login")
	public void user_is_able_to_login() throws InterruptedException {
		Thread.sleep(10000);
		loginpage.isDisplayed();
		genPage.appID();
		genPage.enterLastName("ABC");
		
	}

	@Then("user is able to Edit Application")
	public void user_is_able_to_edit_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
