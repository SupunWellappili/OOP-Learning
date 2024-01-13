package Instance_Blocks;


class RRR {
    int r;

    {
        r = 100;
        System.out.println("Hello!!!");
    }

    RRR() {
        System.out.println("RRR()");
    }


    RRR(int ss) {
        System.out.println("RRR(int)");
    }
}

public class Demo02 {
    public static void main(String[] args) {
        RRR r1 = new RRR();

        System.out.println("///////");

        RRR r2 = new RRR(123);
    }
}
