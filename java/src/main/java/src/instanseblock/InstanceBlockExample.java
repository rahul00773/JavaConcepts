package src.instanseblock;

public class InstanceBlockExample {


    int i =10;

    {

        m1();
        System.out.println("First Instance method");
    }

    InstanceBlockExample(){

        System.out.println("Constructor");
    }

    public static void main(String[] args){
        InstanceBlockExample instanceBlockExample = new InstanceBlockExample();

        System.out.println("Main");
        
    }

    public void m1()
    {

        System.out.println(j);
    }

    {

        System.out.println("Second Instance block");
    }
    int j =20;

    
}