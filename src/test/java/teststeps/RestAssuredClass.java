//package test;
//
//import io.
//
//public class RestAssuredClass {
//
//	public static void main(String[] args) {
//		RestAssured
//		Response res = 
//
//	}
//
//}
package teststeps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestAssuredClass {
    public static void main(String[] args) {
        // Base URL of the API
        String baseUrl = "https://api.example.com";

        // JSON body for the request
//        String requestBody = "{\"key\":\"value\"}";

        // Headers for the request
//        String contentTypeHeader = "Content-Type";
//        String contentTypeValue = "application/json";
//        String authorizationHeader = "Authorization";
//        String authorizationValue = "Bearer your_access_token";

        // Making the request using RestAssured and capturing the response
        Response response = RestAssured.given()
//                .baseUri("https://dummy.restapiexample.com")
//                .header(contentTypeHeader, contentTypeValue)
//                .header(authorizationHeader, authorizationValue)
//                .body(requestBody)
                .contentType(ContentType.JSON).when()
                .get("https://dummy.restapiexample.com/api/v1/employee/1");

        // Retrieving the status code from the response
        
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);
        System.out.println("Response: " + response.asString());
    }
}

