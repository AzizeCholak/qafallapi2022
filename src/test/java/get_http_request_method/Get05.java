package get_http_request_method;

import base_urls.HerokuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get05 extends HerokuAppBaseUrl {
      /*
           Given
               https://restful-booker.herokuapp.com/booking
           When
               User send a request to the URL
           Then
               Status code is 200
           And
              Among the data there should be someone whose firstname is "Jim" and last name is "Brown"
*/

    @Test
    public void get01(){

        //set the url

        spec.pathParams("first", "booking").queryParams("firstname", "Mark", "lastname","Brown");

        //Send the request

        Response response = given().spec(spec).when().get("/{first}");
        response.prettyPrint();

    }
}
