package src.staticblock;


// Doc reference : == https://github.com/rahul00773/JavaConcepts/wiki/Static-control-flow-in-Parent-to-child-Relationship
public class Parent {
    static int x=10;     //1  int x=0 //7  //12

static{ //2  
m1(); // 13
System.out.println("First Static Block");  ///15

}

public static void main(String[] args){ //3
m1(); // 13

System.out.println("Main Method");

}

public static void m1(){ ////4 //14

System.out.println(j);//  / j=0 //9 
}


static int j =20; //5  // 12 j =20 // 16
    
}


 class Child extends Parent{

    static int I=100;  // 6. ///17

    static{ //7
    m2(); //  18
    System.out.println("Derived first Static Block");  ////20
    
    }
    
    public static void main(String[] args){ //8
    m2(); // 13 ////23
    
    System.out.println("Derived Main Method"); ///25
    
    }
    
    public static void m2(){ ///9 //14
    
    System.out.println(y);//  / j=0 //9 ///19///24
    }
    
    
    static{ //10
    System.out.println("Derived second Static Block");  ///21
    }
    
    static int y =200;  //11 //22
    

}