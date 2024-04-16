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
           new MyClass();
           new MyClass();
           new MyClass();

          // System.gc();
        Runtime.getRuntime().gc();

        try {
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println("End Main");

    }
}
