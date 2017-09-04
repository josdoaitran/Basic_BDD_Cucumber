package steps;

import basics.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doai.tran on 8/20/2017.
 */
public class GeneralStepDefinition extends BaseUtil{
    private BaseUtil base;
    public GeneralStepDefinition(){
        this.base = base;
    }
    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        System.out.println("I navigate to login page.");
        driver.get("https://google.com");
    }

    @And("^I click on login link$")
    public void iClickOnLoginLink() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click on login link.");
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter the following for login.");
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        for (User user : users) {
            System.out.println("The Username is: " + user.username);
            System.out.println("The Password is: " + user.password);

        }
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        System.out.println("I click on login button.");
    }

    @Then("^I should see the home page$")
    public void iShouldSeeTheHomePage() throws Throwable {
        System.out.println("I should see the home page.");
    }
}
