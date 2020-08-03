package src.staticblock.riwo;

public class ReadIndirectlyWriteOnly {


    
    
}

class Test{

    static int I =10;
    
    static{

    m1();
    
    System.out.println(I); // Direct Read
    }
    
    public static void m1(){
    System.out.println(I); // Indirect read
    }
    
    }
    