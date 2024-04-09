package Method_Overring;


class A {
    int a;

    public void print() {
        System.out.println("Print() of A");
    }
}

class B extends A {
    int b;

    //@Override
    public void print() {//Legal --> Method Overriding --> Same Name,Same Parameter
        System.out.println("Print() of B");

    }
}

class Demo01 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.print();
        b1.print();

    }
}
