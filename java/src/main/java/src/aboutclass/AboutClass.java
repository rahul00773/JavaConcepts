package src.aboutclass;

//public
//provate
//protected
// default --

public class AboutClass {

     
 static public int x =10;

 protected static int y =10;

 protected int z =20;

 public void test(){

    System.out.println("About class Test Method");
 }

 public  static void main(String[] args){

     Student student = new Student("robin",2,"B");

     Student student1 = new Student("robin singh ",3,"C");

     System.out.println(student.getName());
     System.out.println(student1.getName());

 }

}
