package Exception;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("Start Main");
        try {
            new A().mA();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End Main");
    }
}

class A {
    void mA() throws Exception{
        System.out.println("Start mA");
        new B().mB();
        System.out.println("End mA");
    }
}

class B {
    void mB() throws Exception{

        System.out.println("Start mB");
        new C().mC();
        System.out.println("End mB");

    }
}

class C {
    void mC() throws Exception{
        System.out.println("Start mC");
        int x = 10/0;
        System.out.println("End mC");
    }
}
