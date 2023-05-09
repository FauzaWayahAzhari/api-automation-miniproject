package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {
    protected static String url = "https://altashop-api.fly.dev/api/auth/";
    @Step("I set valid POST endpoint")
    public String setValidPostEndpoint(){ return url + "register";}
    @Step("I send POST HTTP Req")
    public void sendPostHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "testapi12@mail.com");
        requestBody.put("password", "testapi12");
        requestBody.put("fullname","Tes Api");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidPostEndpoint());
    }
    @Step("I receive correct HTTP response code is 200")
    public void receiveCorrectHttpResCode200(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalid POST endpoints")
    public String setInvalidPostEndpoints(){ return url + "regis";}
    @Step("I send POST HTTP Reques")
    public void sendPostHttpReques(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "test1@mail.com");
        requestBody.put("password", "test123");
        requestBody.put("full name","Test Api");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setInvalidPostEndpoints());
    }
    @Step("I receive correct HTTP response code is 404")
    public void receiveCorectHttpResponseCode(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I set valid POST endpoints")
    public String setValidPostEndpoints(){return url + "login";}
    @Step("I send POST HTTP Reqs")
    public void sendPostHttpReqs(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fauzawayahazhari@gmail.com");
        requestBody.put("password", "password123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setValidPostEndpoints());
    }
    @Step("I receive the HTTP response code is 200")
    public void receiveTheHttpResponseCode(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalids POST endpoint")
    public String setInvalidsPostEndpoin(){ return url + "log";}
    @Step("I sending POST HTTP Reques")
    public void sendingPostHttpReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fauzawayahazhari@gmail.com");
        requestBody.put("password", "password123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setInvalidsPostEndpoin());
    }
    @Step("I receive the HTTP response code is 404")
    public void receiveTheHttpResponseCodeIs404(){restAssuredThat(response -> response.statusCode(404));}
}
