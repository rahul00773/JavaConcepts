package src.generic;

import java.util.ArrayList;

public class FindMax {

    public static <T extends Comparable<T>> T array_max(T data[], int n) {
        //body of code

        T max = data[0];

        int let = 0;

        for (int i = 1; i < n; i++) {


            if (data[i].compareTo(max) > 0) {
                max = data[i];
            }
        }


        return max;
    }

    public static void main(String[] args) {


        Integer[] arr = {2, 8, 20, 3, 4};

        System.out.println(array_max(arr, 5));


        Double arr1[] = {2.7, 3.8, 5.5, 6.7, 9.7};

        System.out.println(array_max(arr1, 5));

        int value = 23;
        System.out.print(value / 10);

        String word = "Hello";
        word.toUpperCase();
        word.toLowerCase();
        System.out.println(word);

        System.out.println("\"\\Hello World\\\"");

        String str = "Hello" + "\" " + "/World\"";

        System.out.println(str);


        if (true && false && true || false)
            System.out.println("True");
        else if (false && false && true)
            System.out.println("False");
        else
            System.out.println("Nothing");


        int var = (false) ? 7 : 8;
        System.out.println(var);

        int[][] arr2d = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}};
        System.out.print(arr2d.length + " " + arr2d[1][3]);


    }

}
