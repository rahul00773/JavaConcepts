package src.enums;

public enum Month {
    jan(31),feb(28),mar(31),apr,may,;


    int value;

    private Month(int v){

        this.value=v;
    }

    private Month(){

        this.value= 30;
    }



    public static void main(String[] args){


        Month[] arr = Month.values();

        for ( Month ab:arr){

            System.out.println(ab);
        }


       Month m =  Month.jan;
        System.out.println(m);
    }



}
