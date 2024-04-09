package Dynamic_Method_Dispatch;


class A{
    int a;
    void print(){
        System.out.println("print() of A");
    }
}

class B extends A{
    int b;
    void print(){
        System.out.println("print() of B");
    }
}

public class Demo01 {
    public static void main(String[] args) {
        A a1 = new A();
        a1.print();
        a1= new B();//Runtime Call Subclass Method
        a1.print();
        B b1 = new B();
        b1.print();//Runtime Polymorphism
    }
}
