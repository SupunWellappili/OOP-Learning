package Constructor;

class Con {
    Con() {
        System.out.println("Con()");
    }

    Con(int x) {
        System.out.println("Con(int x)");
    }

    Con(int x, int y) {
        System.out.println("Con(int x,int y)");
    }
}

public class Demo04 {
    public static void main(String[] args) {
        Con c1 = new Con();
        System.out.println("-------------");

        Con c2 = new Con(12);
        System.out.println("-------------");

        Con c3 = new Con(34, 76);
        System.out.println("-------------");

    }
}
