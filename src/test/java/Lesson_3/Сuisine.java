package Lesson_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class Сuisine {

    private final String apiKey = "95765b6be78a422da5a96155536fae98";
    String id;

    @Test
    void addMealTest() {
        id = given()
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
                        + " \"name\": \"4 potato\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id");
    }
    @Test
    void addMealTestOne() {
        id = given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .body("{\n"
                        + " \"title\": Potato pancakes,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"6 potato\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id");
    }
    @Test
    void addMealTestTwo() {
        id = given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .body("{\n"
                        + " \"title\": Russian beet soup,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"1 tomato\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id");
    }    @Test
    void addMealTestThree() {
        id = given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .body("{\n"
                        + " \"title\": Fried rice,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"2 apple\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id");
    }    @Test
    void addMealTestFour() {
        id = given()
                .queryParam("hash", "bed380b6891cd6278dd129c1743024184e8e72d9\n")
                .queryParam("username", "toredo89")
                .queryParam("apiKey", apiKey)
                .body("{\n"
                        + " \"title\": Risotto,\n"
                        + " \"slot\": 1,\n"
                        + " \"position\": 0,\n"
                        + " \"type\": \"INGREDIENTS\",\n"
                        + " \"value\": {\n"
                        + " \"ingredients\": [\n"
                        + " {\n"
                        + " \"name\": \"3 eggs\"\n"
                        + " }\n"
                        + " ]\n"
                        + " }\n"
                        + "}")
                .when()
                .post("https://api.spoonacular.com/recipes/cuisine/")
                .then().statusCode(200)
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id");
    }
}
