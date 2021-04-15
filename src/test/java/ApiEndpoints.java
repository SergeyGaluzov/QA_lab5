import entities.Basket;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class ApiEndpoints {


    public Response getPantryDetails(String pantryId) {
        return given().
                pathParam("pantryId", pantryId).when().
                get(ConfigPath.BASE_URL + ConfigPath.Pantry_By_ID).
                then().extract().response();
    }

    public Response createBasket(Basket basket, String basketId) {

        return given().
                body(basket).
                pathParam("id", basketId).
                when().
                post(ConfigPath.CREATE_BASKET_AT_ID).then().
                extract().response();
    }

    public Response getBasket(String idBusket) {
        return given().
                pathParam("id", idBusket).
                when().
                get(ConfigPath.CREATE_BASKET_AT_ID).then().
                extract().response();
    }

    public Response deleteBasket(String idBusket) {
        return given().
                pathParam("id", idBusket).
                when().
                delete(ConfigPath.CREATE_BASKET_AT_ID).then().
                extract().response();
    }
}
