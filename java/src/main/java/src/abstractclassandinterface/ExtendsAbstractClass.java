package src.abstractclassandinterface;

public class ExtendsAbstractClass extends TestClass implements ITestClass {


    @Override
    public String requestUrl() {
        return null;
    }

    @Override
    public Integer statusCode() {
        return null;
    }

    @Override
    public void iTestMethod3() {

        System.out.println("This is method 3 of test class");

    }
}
