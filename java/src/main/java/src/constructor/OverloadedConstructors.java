package src.constructor;

public class OverloadedConstructors {


    OverloadedConstructors(){

        this(10);
        System.out.print("no arg constructor");

    }

    OverloadedConstructors(int x){

        this(10.5);
        System.out.print("int arg constructor");

    }

    OverloadedConstructors(double x){

       
        System.out.print("double arg constructor");

    }


    public static void main(String[] args){

        OverloadedConstructors o = new OverloadedConstructors();

        
        OverloadedConstructors o1 = new OverloadedConstructors(10);

        OverloadedConstructors o2 = new OverloadedConstructors(10.5);


        OverloadedConstructors o3 = new OverloadedConstructors(10l);
    }
    
}