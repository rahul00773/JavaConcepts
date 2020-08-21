package src.constructor;

import src.aboutclass.AboutClass;

public class Student extends AboutClass{


    String name;
    int rollNo;

    Student(String n, int r){

        this.name = n;

        this.rollNo=r;
    }


    public static void main(String[] args){


        System.out.println(y);

        System.out.println(AboutClass.x);
       

        Student s1 = new Student("rahul",101);
        Student s2 = new Student("kumar",102);
    }
    
}