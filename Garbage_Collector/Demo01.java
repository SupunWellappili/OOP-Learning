package Garbage_Collector;

class MyClass {
    int a;

    MyClass(int a) {
        this.a = a;
    }

    public void finalize() { //GC
        System.out.println("Deleted....");
    }
}

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Start Main");
        MyClass m1 = new MyClass(100);
        m1 =null;

        // System.gc();
        Runtime.getRuntime().gc();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println("End Main");

    }
}
