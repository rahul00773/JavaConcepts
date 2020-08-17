package src.enums;

public class Test2 {

    enum Beer{

        FO,KF,MO
        }

        public static void main(String[] args){

            Beer[] b = Beer.values();
            
            for(Beer b1:b){
            
            System.out.println(b1 +"oridinal value is" +b1.ordinal());
            }
        }
    
}