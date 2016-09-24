package cucumber.features;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.ui.Application;
import com.sun.security.jgss.ExtendedGSSContext;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.*;

public class StepDefinations {
public WebDriver Appln;	
	@Given("^Navigate \"([^\"]*)\"$")
	public void navigate(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Appln=CommonLib.Prereqisite();
		Appln.navigate().to(arg1);
		System.out.println("test");
		
	}

	@When("^Click$")
	public void click() throws Throwable {
		try{
			System.out.println(Appln.getTitle());
			
			System.out.println("Click to");
		}
		catch(Exception e){
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(e.getLocalizedMessage());
	}
	}
	
	@Then("^Verify ([[a-z]A-Z]*)$")
	public void verify(String link) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			System.out.println("Verify");
			System.out.println(link);
		}
		catch(Exception e){
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	}
	
	@And("^submitvaliddata$")
	public void submit_valid_data(DataTable arg1) throws Throwable {
		System.out.println("args "+arg1.raw());
		List<List<String>> args = arg1.raw();
		System.out.println("row 1"+args.get(0).get(0));
		System.out.println("row 1"+args.get(1).get(0));
		System.out.println("row 1"+args.get(0).get(1));
		System.out.println("row 1"+args.get(1).get(1));
	}
	
	@Then("^QuitDriver ([A-Z]*)$")
	public void quitdriver(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(title);
		Appln.close();
	  
	}
}
