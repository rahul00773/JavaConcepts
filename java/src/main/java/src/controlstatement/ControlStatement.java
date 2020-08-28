package src.controlstatement;

import java.util.Scanner;

public class ControlStatement {


    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String name = sc.nextLine();
        System.out.println(name);

        System.out.println(x);


        int i = 20;

        switch (i)
        {

            case (10):
                System.out.println("i is equal to  10");
                break;
            case (20):
                System.out.println("i is equal to 20");
                break;
            default:
                System.out.println("we don't match any value");

        }

        System.out.println("hello");
    }
}
