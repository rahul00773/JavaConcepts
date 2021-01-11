package src.instanseblock;

public class Child extends Parent {

    int x = 100;

    {
        m2();
        System.out.println("child class first instance block");
    }

    Child() {

        System.out.println("child constructor");
    }

    public static void main(String[] args) {

        Child child = new Child();

        System.out.println("child main");

    }

    public void m2() {

        System.out.println(y);
    }

    {
        System.out.println("Second child Instance block");

    }

    int y = 200;
}
