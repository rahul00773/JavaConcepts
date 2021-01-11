package api;

import io.restassured.http.ContentType;

public class BookStore  extends BaseApi{

    private BaseApi api;

    public BookStore(){

       getRequestSpecBuilder().setContentType(ContentType.JSON);
       getRequestSpecBuilder().setBasePath("/BookStore/v1/Books");
       getRequestSpecBuilder().setBaseUri("https://demoqa.com/");

      setMethodType("GET");
        this.api = api;
    }
}
