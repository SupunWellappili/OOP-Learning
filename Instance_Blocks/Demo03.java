package Instance_Blocks;

class MMM {
    int a = 10;

    {
        a = 100;
        b = 200;
    }

    int b = 20;

    MMM() {

       /* a=10;
        a=100;
        b=200;
        b=20;*/

    }

    MMM(int i, int j) {
        a = i;
        b = j;

         /* a=10;
        a=100;
        b=200;
        b=20;
        a=1;
        b=2;*/
    }
}


public class Demo03 {
    public static void main(String[] args) {
        MMM m1 = new MMM();
        System.out.println(m1.a + "-->" + m1.b);

        MMM m2 = new MMM(1, 2);
        System.out.println(m2.a + "-->" + m2.b);
    }
}
