package src.staticblock;



// Document Reference - https://github.com/rahul00773/JavaConcepts/wiki/Static-Block

public class Base {

    static int x=10;     //1 int x=0 //7 

static{ //2
m1(); // 8
System.out.println("First Static Block");  ///10

}

public static void main(String[] args){ //3
m1(); // 13

System.out.println("Main Method");

}

public static void m1(){ //4 //14

System.out.println(j);//  / j=0 //9 
}

static{ //5 
System.out.println("Second Static Block"); //11
}


static int j =20; //6  // 12 j =20 //

    
}