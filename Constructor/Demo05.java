package Constructor;

class Toy {
    Toy() {
    }

    Toy(int xx, int yy) {
        System.out.println("Toy(int xx,int yy)");
    }
}

public class Demo05 {
    public static void main(String[] args) {
        Toy t1 = new Toy();
        //   t1.Toy(12,43,54);//Illegal
        // Object 1kak hadala eta passe constructor call krnna baa..object 1ka sadana stagement akema call krnna ona


        Toy t2 = new Toy(123, 533);


    }
}
