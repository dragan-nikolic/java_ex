// use JUnit 5 ParameterizedTest instead of JUnit 4 DataProvider

package examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Chapter3Test {

    @ParameterizedTest
    @MethodSource("zipCodesAndPlaces")
    public void requestZipCodesFromCollection_checkPlaceNameInResponseBody_expectSpecifiedPlaceName(String countryCode, String zipCode, String expectedPlaceName) {

        given().
            pathParam("countryCode", countryCode).
            pathParam("zipCode", zipCode).
        when().
            get("http://zippopotam.us/{countryCode}/{zipCode}").
        then().
            assertThat().
            body("places[0].'place name'", equalTo(expectedPlaceName));
    }

    static Stream<Arguments> zipCodesAndPlaces() {
        return Stream.of(
                arguments("us", "90210", "Beverly Hills"),
                arguments("us", "12345", "Schenectady"),
                arguments("ca", "B2R", "Waverley")
        );
    }
}
