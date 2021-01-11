package testcases.scripts;

import org.testng.annotations.*;

public class TestNg {

    @BeforeSuite()
    public void runBeforeSuite(){

        System.out.println("This is before Suite");
        System.out.println(Thread.currentThread().toString());
    }

    @BeforeClass()
    public void runBeforeClass(){

        System.out.println("This is before Class");
        System.out.println(Thread.currentThread().toString());
    }

    @BeforeMethod()
    public void runBeforeMethod(){

        System.out.println("This is beforeMethod");
        System.out.println(Thread.currentThread().toString());


    }

    @BeforeTest()
    public void runBeforeTest(){
        System.out.println("This is before Test");
        System.out.println(Thread.currentThread().toString());

    }

    @AfterMethod
    public void runAfterMethod(){

        System.out.println("This is afterMethod");
        System.out.println(Thread.currentThread().toString());
    }
}
