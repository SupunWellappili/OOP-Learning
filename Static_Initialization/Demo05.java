package Static_Initialization;


public class Demo05 {

    int x = 100;//instance --> New Initialization
    static int y = 200;

    public static void main(String[] args) {
        System.out.println(new Demo05().x);//100

        Demo05 x1 = new Demo05();
        System.out.println(x1.x);//100
    }

    public void get() {
        System.out.println(x);
        System.out.println(y);
    }
}
