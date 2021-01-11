package src.instanseblock;

public class Parent {

    int i = 10;

    {

        m1();
        System.out.println("First Instance method");
    }

    Parent() {

        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Main");

    }

    public void m1() {

        System.out.println(j);
    }


    int j = 20;


}
