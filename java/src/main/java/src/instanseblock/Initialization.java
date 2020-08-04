package src.instanseblock;

public class Initialization {

    public static String m1(String m) {

        System.out.println(m);
        return m;
    }

   public Initialization() {
        m = m1("1");
    }

    {
        m = m1("2");
    }

    String m = m1("3");

    public static void main(String[] args) {
      Object o = new Initialization();
    }

}