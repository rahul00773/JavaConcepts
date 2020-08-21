package src.aboutclass;

public class Student {


    Student(String n, int r, String g,String f){

        this.name = n;
        this.rollNo=r;
        this.grade=g;
    }

    Student(String n, int r, String g){

        this.name = n;
        this.rollNo=r;
        this.grade=g;
    }


    Student(){

    }


    private String name;
   private int rollNo;
   private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }



}
