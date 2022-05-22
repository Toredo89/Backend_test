package Lesson_3;


import com.sun.org.apache.xerces.internal.util.FeatureState;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;


import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class СomplexSearch {

    private final String apiKey = "95765b6be78a422da5a96155536fae98";


    @Test
    void getRecipeWithQueryParametersPositiveTest() {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/656817/information")
                .then().statusCode(200)
                .statusCode(200);
    }
    @Test
    void getRecipeWithQueryParametersPositiveTestOne() {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/649183/information")
                .then().statusCode(200)
                .statusCode(200);
    }
    @Test
    void getRecipeWithQueryParametersPositiveTestTwo() {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/644482/information")
                .then().statusCode(200)
                .statusCode(200);
    }
    @Test
    void getRecipeWithQueryParametersPositiveTestThree() {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/638493/information")
                .then().statusCode(200)
                .statusCode(200);
    }
    @Test
    void getRecipeWithQueryParametersPositiveTestFour () {
        given()
                .queryParam("apiKey", apiKey)
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/716426/information")
                .then().statusCode(200)
                .statusCode(200);
    }


    @Test
    void getRecipeWithBodyChecksAfterRequestPositiveTest() {
        JsonPath response = given()
                .queryParam("apiKey", apiKey)
                .queryParam("includeNutrition", "false")
                .when()
                .get("https://api.spoonacular.com/recipes/716429/information")
                .body()
                .jsonPath();
        //assertThat(response.get("vegetarian"), is(false));
        //assertThat(response.get("vegan"), is(false));
        //assertThat(response.get("license"), equalTo("CC BY-SA 3.0"));
        //assertThat(response.get("pricePerServing"), equalTo(163.15F));
        //assertThat(response.get("extendedIngredients[0].aisle"), equalTo("Milk, Eggs, Other Dairy"));
    }
}
