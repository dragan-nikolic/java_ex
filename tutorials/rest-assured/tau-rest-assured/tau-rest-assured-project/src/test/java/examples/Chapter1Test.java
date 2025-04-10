package examples;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Chapter1Test {

    /**
     * Request: curl --request GET --url https://api.zippopotam.us/US/90210
     *
     * Response:
     * {
     *   "post code": "90210",
     *   "country": "United States",
     *   "country abbreviation": "US",
     *   "places": [
     *     {
     *       "place name": "Beverly Hills",
     *       "longitude": "-118.4065",
     *       "state": "California",
     *       "state abbreviation": "CA",
     *       "latitude": "34.0901"
     *     }
     *   ]
     * }
     */
    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills() {
       given().
       when().
           get("http://zippopotam.us/us/90210").
       then().
           assertThat().
           body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills_v2() {
         RequestSpecification xgiven = given();
         RequestSpecification xwhen = xgiven.when();
         Response xget = xwhen.get("http://zippopotam.us/us/90210");
         ValidatableResponse xthen = xget.then();
         ValidatableResponse xassert = xthen.assertThat();
         xassert.body("places[0].'place name'", equalTo("Beverly Hills"));
    }
}
