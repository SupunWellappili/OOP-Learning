package Constructor;


class A {
    A() {
    }
}

class B {
    int b;

    B(int b) {
        this.b = b;
    }

}

public class Demo03 {
    public static void main(String[] args) {
        A a1 = new A();//Legal
        B b1 = new B(89);//api constructor kenek heduwama constructor values danne naa

    }
}
