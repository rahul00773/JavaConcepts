package src.constructor;

public class Test2 {


    Test2(){
        System.out.println("hello");
    }

    public  void  test(){

        Test1 tet1 = new Test1(1,"srt");

    }


    static {

        System.out.println("static block");
    }
}
