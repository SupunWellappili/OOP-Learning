package Constructor;

class AA {
    AA() {
      //  A(100);//Illegal
        this(100);//A(int i) kiyana constructor 1ka call krna widiya..meya sop 1ka yatin danna baa rules 1kak udinma thiyenna ona

        System.out.println("AA()");
    }

    AA(int i) {
        System.out.println("AA(int)");
    }
}

public class Demo07 {
    public static void main(String[] args) {
        AA a = new AA();
    }
}
