package Method_Overring;

class P {
    int a;

    public void print() {
        System.out.println("Print() of A");
    }
}

class Q extends P{
    int b;

    public void print() {
        System.out.println("Print() of B");
    }

    public void callPrint(){
        print();//From SubClass
        super.print();//From SuperClass
    }
}


class Demo02 {
    public static void main(String[] args) {
        Q q1 = new Q();
        //q1.super.print(); //Error
        //q1.print();
        q1.callPrint();
    }
}
