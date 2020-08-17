package src.enums;

public class Test {

    public int x=0;

enum Beer{

    FO, KF,MS

}

public static void main(String[] args){

Beer b= Beer.FO;

switch(b){

    case FO:
        System.out.println("KF beer");
        break;

    case KF:
    System.out.println("KF beer");
    break;
default:
    break;
}
}

}
