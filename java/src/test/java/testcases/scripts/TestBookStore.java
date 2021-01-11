package testcases.scripts;

import api.BookStore;
import org.hamcrest.Matchers;
import org.junit.platform.engine.support.discovery.SelectorResolver;
import org.testng.annotations.Test;

public class TestBookStore extends TestNg {

    @Test
    public void test() throws Exception  {

      TestNg testNg = new TestNg();
        BookStore  bookStore = new BookStore();

        bookStore.executeApi().then().statusCode(200).body("books[0].isbn", Matchers.allOf(Matchers.equalToIgnoringCase("9781449325862")));
    }


    @Test
    public void test1() throws Exception  {

        TestNg testNg = new TestNg();
        BookStore  bookStore = new BookStore();

        bookStore.executeApi().then().statusCode(200).body("books[0].isbn", Matchers.allOf(Matchers.equalToIgnoringCase("9781449325862")));


    }


    @Test
    public void test2() throws Exception  {

        TestNg testNg = new TestNg();
        BookStore  bookStore = new BookStore();

        bookStore.executeApi().then().statusCode(200).body("books[0].isbn", Matchers.allOf(Matchers.equalToIgnoringCase("9781449325862")));
    }


}
