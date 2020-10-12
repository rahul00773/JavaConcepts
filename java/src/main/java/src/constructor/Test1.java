package src.constructor;

public class Test1 extends Test {

    /**
     * It's a method but not constructor
     */

    int x =0;
    int y = 1;

     Test1(){


         this.x=1;
         super.x=10;

    }
    

    Test1(int x, String  y){

    }


    public static void main(String[] args){

        Test1 t = new Test1();

        Test2 test2 = new Test2();


    }

}
