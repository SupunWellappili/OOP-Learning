package Cases;

import java.util.Arrays;

class gift{
    int length;

}
public class Demo01 {
    public static void main(String[] args) {
        //Array
        int [] x = new int[3];
        System.out.println(Arrays.toString(x));

        x[0] = 100;
        System.out.println(Arrays.toString(x));

        //Object
        gift g1 = new gift();
        g1.length =18;

        System.out.println(g1.length);
        System.out.println(g1.hashCode());

    }
}

/*
[0, 0, 0]
[100, 0, 0]
18
757108857
*/