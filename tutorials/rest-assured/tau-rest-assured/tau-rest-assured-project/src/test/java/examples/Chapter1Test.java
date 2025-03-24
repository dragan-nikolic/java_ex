package examples;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Chapter1Test {

    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills() {

        // RequestSpecification xgiven = given();
        // RequestSpecification xwhen = xgiven.when();
        // Response xget = xwhen.get("http://zippopotam.us/us/90210");
        // ValidatableResponse xthen = xget.then();
        // ValidatableResponse xassert = xthen.assertThat();
        // ValidatableResponse xbody = xassert.body("places[0].'place name'", equalTo("Beverly Hills"));
        // int x = 5;
       given().
       when().
           get("http://zippopotam.us/us/90210").
       then().
           assertThat().
           body("places[0].'place name'", equalTo("Beverly Hills"));
    }
}
