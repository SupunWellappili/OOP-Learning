package Garbage_Collector;

class MyClass {
    long[] xr = new long[100000];

}

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Start Main");
        MyClass[] cr = new MyClass[10000];

        for (int i = 0; i < 10000; i++) {
            System.out.println("i: " + i);
           cr[i]= new MyClass();
        }
        System.out.println("End Main");

    }
}
