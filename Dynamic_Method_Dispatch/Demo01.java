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
        a1= new B();//Dynamic Method Diospatch (Runtime Call Subclass Method )  --> super class reference akata sub class object akak aragena ayaa call kranawa nam a method akata athtama compile wenne super type aken(a1) run wenne sub class method(a1,print()) aken
        a1.print();
        B b1 = new B();
        b1.print();//Runtime Polymorphism
    }
}
