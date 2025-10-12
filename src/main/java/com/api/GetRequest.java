package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class GetRequest {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api/users";

        Response response = given()
                .when()
                .get();

        String responseBody = response.getBody().toString();

       System.out.println(response.asPrettyString());

        // 🔹 Parse response into JSONObject
        JSONObject json = new JSONObject(responseBody);

        // ========== Validate Top Level Fields ==========
        Assert.assertEquals(json.getInt("page"), 1);
        Assert.assertEquals(json.getInt("per_page"), 6);
        Assert.assertEquals(json.getInt("total"), 12);
        Assert.assertEquals(json.getInt("total_pages"), 2);

        // ========== Validate Data Array ==========
        JSONArray dataArray = json.getJSONArray("data");
        Assert.assertEquals(dataArray.length(), 6);  // should have 6 users

        // Example: validate first user
        JSONObject firstUser = dataArray.getJSONObject(0);
        Assert.assertEquals(firstUser.getInt("id"), 1);
        Assert.assertEquals(firstUser.getString("first_name"), "George");
        Assert.assertEquals(firstUser.getString("last_name"), "Bluth");
        Assert.assertTrue(firstUser.getString("email").contains("@reqres.in"));

        // Validate all users have an email and avatar
        for (int i = 0; i < dataArray.length(); i++) {
            JSONObject user = dataArray.getJSONObject(i);
            Assert.assertTrue(user.has("id"));
            Assert.assertTrue(user.getString("email").endsWith("@reqres.in"));
            Assert.assertTrue(user.getString("avatar").startsWith("https://"));
        }

        // ========== Validate Support Object ==========
        JSONObject supportObj = json.getJSONObject("support");
        Assert.assertTrue(supportObj.getString("url").contains("reqres"));
        Assert.assertTrue(supportObj.getString("text").contains("Content Caddy"));

        System.out.println("✅ All validations passed successfully!");


    }
}
