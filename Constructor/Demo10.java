package Constructor;


class TTT {
    int t;

    TTT() {
        t = 100;
    }

    TTT(int c) {
        t = 200;
    }
}

public class Demo10 {
    public static void main(String[] args) {
        TTT t1 = new TTT();
        System.out.println(t1.t);

        TTT t2 = new TTT(232);
        System.out.println(t2.t);
    }
}
