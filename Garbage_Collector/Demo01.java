package Garbage_Collector;

class MyClass {
    long[] xr = new long[100000];

    public void finalize(){ //GC
        System.out.println("Deleted....");
    }
}

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Start Main");

        for (int i = 0; i < 10000; i++) {
            System.out.println("i: " + i);
           new MyClass();
        }
        System.out.println("End Main");

    }
}
