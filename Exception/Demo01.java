package Exception;


class Example {
    int x = 100;
    static int y = 200;

}

public class Demo01 {
    public static void main(String[] args) {
        Example m1 = null;
        System.out.println(m1.y);//200
        System.out.println(m1.x);//Error

    }
}
