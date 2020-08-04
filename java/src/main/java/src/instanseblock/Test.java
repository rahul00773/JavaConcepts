package src.instanseblock;

public class Test {

    {

        System.out.println("First Instance block");
    }

    static {

        System.out.println("First Static block");
    }

    Test() {

        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        Test t = new Test();
        System.out.println("Main");
        Test t1 = new Test();

    }

    {

        System.out.println("Second Instance block");
    }

    static {

        System.out.println("Second Static block");
    }
}