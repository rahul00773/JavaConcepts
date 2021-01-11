package api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class BaseApi {

    private RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();

    private Response response;

    public String getMethodType() {
        return methodType;
    }

    public BaseApi setMethodType(String methodType) {
        this.methodType = methodType;
        return this;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public BaseApi setContentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    String methodType;

    ContentType contentType ;

    String basePath;
    String baseUrl;

    public String getBasePath() {
        return basePath;
    }

    public BaseApi setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public BaseApi setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }


    public RequestSpecBuilder getRequestSpecBuilder() {
        return requestSpecBuilder;
    }

    public io.restassured.response.Response  executeApi() throws Exception {

       // io.restassured.response.Response response = null;


        RequestSpecification requestSpecification=  requestSpecBuilder.build();

        RestAssured.defaultParser = Parser.JSON;

     switch (methodType) {


         case ("POST"):
             response =given().spec(requestSpecification).when().post();
             break;

         case ("GET"):
             response = given().spec(requestSpecification).when().get();

             break;

         default:
             throw new Exception("Method not defined");
     }


        return  response;
    }
}
