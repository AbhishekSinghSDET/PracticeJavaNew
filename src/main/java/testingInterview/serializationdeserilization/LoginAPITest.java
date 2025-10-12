package testingInterview.serializationdeserilization;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class LoginAPITest {

    // --------- Request POJO (Serialization) ---------
    public static class UserCredentials {
        private String username;
        private String password;

        public UserCredentials() {} // default constructor

        public UserCredentials(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // getters and setters
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }

    // --------- Response POJO (Deserialization) ---------
    public static class LoginResponse {
        private String message;
        private String token; // assuming API returns a token

        public LoginResponse() {}

        public LoginResponse(String message, String token) {
            this.message = message;
            this.token = token;
        }

        // getters and setters
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public String getToken() { return token; }
        public void setToken(String token) { this.token = token; }
    }

    @Test
    public void loginTest() {
        UserCredentials userCredentials = new UserCredentials("iamfd", "password");

        // -------- Serialization: Java Object -> JSON --------
        Response res = given()
                .baseUri("http://64.227.160.186:9000/v1")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(userCredentials) // POJO -> JSON
                .log().all()
                .when()
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
                .time(lessThan(5000L))
                .body("message", equalTo("Success"))
                .extract().response();

        // -------- Deserialization: JSON -> Java Object --------
        LoginResponse loginResponse = res.as(LoginResponse.class);
        System.out.println("Login Message: " + loginResponse.getMessage());
        System.out.println("Token: " + loginResponse.getToken());
    }
}
