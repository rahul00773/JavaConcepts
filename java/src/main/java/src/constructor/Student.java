package src.constructor;


public class Student {


    String name;
    int rollNo;

    Student(String n, int r){

        this.name = n;

        this.rollNo=r;
    }


    public static void main(String[] args){

        Student s1 = new Student("rahul",101);
        Student s2 = new Student("kumar",102);
    }
    
}