package Static_Initialization;

class Test{
    int a;
    static int b;
}

public class Demo01 {
    public static void main(String[] args) {
        Test t1= new Test();
        t1.a =1;
        t1.b=2;

        Test t2 = new Test();
        t2.a=100;
        t2.b=200;

        System.out.println(t1.a+"---"+t1.b);
        System.out.println(t2.a+"---"+t2.b);
    }
}
