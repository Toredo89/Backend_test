package Lesson_4;

import io.restassured.path.json.JsonPath;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import static Lesson_4.AbstractTest.requestSpecification;
import static io.restassured.RestAssured.given;

public class СuisineOne extends AbstractTest{

    private final String apiKey = "95765b6be78a422da5a96155536fae98";
    String id;

    @Test
    void addMealTest() {
        given().spec(requestSpecification)
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .queryParam("id", id)
                .when()
                .formParam("title","Nachos")
                .post("https://api.spoonacular.com/recipes/cuisine/").prettyPeek()
                .then().statusCode(200)
                .extract()
                .response()
                .body();

    }
    @Test
    void addMealTestOne() {
        given().spec(requestSpecification)
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .queryParam("id", id)
                .when()
                .formParam("title","Potato pancakes")
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .extract()
                .response()
                .body();
    }
    @Test
    void addMealTestTwo() {
        given().spec(requestSpecification)
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .queryParam("id", id)
                .when()
                .formParam("title","Russian beet soup")
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .extract()
                .response()
                .body();
    }    @Test
    void addMealTestThree() {
        given().spec(requestSpecification)
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .queryParam("id", id)
                .when()
                .formParam("title","Fried rice")
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .extract()
                .response()
                .body();
    }    @Test
    void addMealTestFour() {
        given().spec(requestSpecification)
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .queryParam("id", id)
                .when()
                .formParam("title","Risotto")
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .extract()
                .response()
                .body();
    }
}
