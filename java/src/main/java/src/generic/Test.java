package src.generic;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Test {

    /**
     * 
     * Generic allows the reusability of the code. 
     * Where one single method can be used for different data types of variable objects
     * The idea is to allow different types like Integer, String, … etc and user-defined types to be a parameter to methods, classes, and interfaces
     */


     public static void main(String[] args){


        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
            MaximumTestWithGeneric.maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
        MaximumTestWithGeneric.maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
        MaximumTestWithGeneric.maximum("pear", "apple", "orange"));


     }



    


}

class MaximumTest{

    public static int maximum(int x, int y, int z) {
        int max = x; // assume x is initially the largest

        if (y > max) {
            max = y; // y is the largest so far
        }

        if (z > max) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }


    public static double maximum(double x, double y, double z) {
        double max = x; // assume x is initially the largest

        if (y > max) {
            max = y; // y is the largest so far
        }

        if (z > max) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

    public static String maximum(String x, String y, String z) {
        String max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }

}


class MaximumTestWithGeneric{


    public static <T extends Comparable <T>> T maximum(T x, T y , T z ){


        T max = x;

        if(y.compareTo(max)>0){
            max =y;
        }

        if(z.compareTo(max)>0){
            max=z;
        }

        return max;
    }
}