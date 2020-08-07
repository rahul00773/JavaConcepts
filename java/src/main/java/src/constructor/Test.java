package src.constructor;

public class Test {


    public static int count=0;

    {
        count++;
    }

    Test(){

    }

    Test(int i){

    }

    Test(double d){

    }


    public static void main(String[] args){


        Test t = new Test();
        Test t1 = new Test(10);
        Test t2= new Test(10.5);


        System.out.println("number of object created : " + count);
    }
    
}