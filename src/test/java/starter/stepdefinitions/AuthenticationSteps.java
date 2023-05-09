package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.Get;
import starter.Authentication.Post;

public class AuthenticationSteps {
    @Steps
    Get get;
    @Steps
    Post post;

    @Given("I set valid POST endpoint")
    public void setValidPostEndpoint(){post.setValidPostEndpoint();}
    @When("I send POST HTTP Req")
    public void sendPostHttpReq(){post.sendPostHttpReq();}
    @Then("I receive correct HTTP response code is 200")
    public void receiveCorrectHttpResCode200(){post.receiveCorrectHttpResCode200();}
    @Given("I set invalid POST endpoints")
    public void setInvalidPostEndpoints(){post.setInvalidPostEndpoints();}
    @When("I send POST HTTP Reques")
    public void sendPostHttpReques(){post.sendPostHttpReques();}
    @Then("I receive correct HTTP response code is 404")
    public void receiveCorectHttpResponseCode(){post.receiveCorectHttpResponseCode();}
    @Given("I set valid POST endpoints")
    public void setValidPostEndpoints(){post.setValidPostEndpoints();}
    @When("I send POST HTTP Reqs")
    public void sendPostHttpReqs(){post.sendPostHttpReqs();}
    @Then("I receive the HTTP response code is 200")
    public void receiveTheHttpResponseCode(){post.receiveTheHttpResponseCode();}
    @Given("I set invalids POST endpoint")
    public void setInvalidsPostEndpoin(){post.setInvalidsPostEndpoin();}
    @When("I sending POST HTTP Reques")
    public void sendingPostHttpReq(){post.sendingPostHttpReq();}
    @Then("I receive the HTTP response code is 404")
    public void receiveTheHttpResponseCodeIs404(){post.receiveTheHttpResponseCodeIs404();}
    @Given("I am set valid GET endpoint")
    public void iAmSetValidGetEndpoint() {get.iAmSetValidGetEndpoint();}
    @When("I am send GET HTTP Request")
    public void iAmSendGetHttpRequest() {get.iAmSendGETHttpRequest();}
    @Then("I am receive correct HTTP response code 200")
    public void iAmReceiveCorrectHttpResponseCode() {get.iAmReceiveCorrectHttpResponseCode();}
    @Given("I am set invalid GET endpoint")
    public void iAmSetInvalidGetEndoint(){get.iAmSetInvalidGetEndoint();}
    @When("I am send GET HTTP Requests")
    public void iAmSendGetHttpRequests(){get.iAmSendGetHttpRequests();}
    @Then("I am receive correct HTTP response code 404")
    public void iAmReceiveCorrectHttpResponseCode404(){get.iAmReceiveCorrectHttpResponseCode404();}
}
