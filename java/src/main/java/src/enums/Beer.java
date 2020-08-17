package src.enums;

public enum Beer {

    KF(100),KO(70),RC(90),FO;

    int price;
    Beer(int p)
    {
        this.price=p;
    }

    Beer(){
        this.price=65;
    }

    public int getPrice(){

        return price;
    }
    
}