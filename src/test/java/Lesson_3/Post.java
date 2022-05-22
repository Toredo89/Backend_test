package Lesson_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Post {
    private final String apiKey = "95765b6be78a422da5a96155536fae98";
    public final String username = "toredo89";

    @Test
    void addMealTest() {
        String id = given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .body("{\n"
                        + " \"title\": Nachos,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"3 banana\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/mealplanner/:toredo89/shopping-list/items/")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id")
                .toString();

        given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9")
                .queryParam("apiKey", apiKey)
                .queryParam("username", "toredo89")
                .delete("https://api.spoonacular.com/mealplanner/:toredo89/shopping-list/items/" + id)
                .then()
                .statusCode(200);
    }
    @AfterEach
    void tearDown() {
        given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("apiKey", "95765b6be78a422da5a96155536fae98")
                .queryParam("username", "toredo89")
                .delete("https://api.spoonacular.com/mealplanner/:toredo89/shopping-list/items/")
                .then()
                .statusCode(200);
    }
}
