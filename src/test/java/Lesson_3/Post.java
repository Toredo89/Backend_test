package Lesson_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Post {
    private final String apiKey = "95765b6be78a422da5a96155536fae98";
    public final String username = "toredo89";
    String id;

    @Test
    void addMealTest() {
        id = given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9")
                .queryParam("apiKey", "95765b6be78a422da5a96155536fae98")
                .body("{\n"
                        + " \"date\": 1644881179,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"2 banana\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/mealplanner/toredo89/items")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id")
                .toString();
    }

    @AfterEach
    void tearDown() {
        given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9")
                .queryParam("apiKey", "95765b6be78a422da5a96155536fae98")
                .delete("https://api.spoonacular.com/mealplanner/toredo89/items/" + id)
                .then()
                .statusCode(200);
    }
}
