package src.exceptionHandling;;

public class Rupeek {
    

    public static void main(String[ ] args) {
        try {
          int value = 6;
          int output = value / 0;
         System.out.println(output);
        }
    catch (ArithmeticException e) {
          System.out.println("Cannot Divide by zero.");
        }
     catch (Exception e) {
          System.out.println("Something went wrong.");
        }
    finally {
          System.out.println("Program is finished.");
        }
      }
    }
    
