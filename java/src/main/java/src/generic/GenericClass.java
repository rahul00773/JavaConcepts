package src.generic;

public class GenericClass<T> {

T obj;

GenericClass(T obj)
{
    this.obj = obj;
}    


public T getObject(){

    return this.obj;
}
}


class Main{

    public static void main(String[] args){


        GenericClass<Integer> genericClass = new GenericClass<Integer>(5);
        System.out.println("Get Integer object from class " + genericClass.getObject());


        GenericClass<String> genericClass2 = new GenericClass<String>("hello");
        System.out.println("Get String object from class " + genericClass2.getObject());


    }
}