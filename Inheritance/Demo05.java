package Inheritance;

class T {
    int a;

    public void printT() {
        System.out.println("a : " + a);
    }
}

class U extends T {
    int p;

    public void printU() {
        System.out.println("p : " + p);
    }

    public void callPrint() {
        printT();
        printU();
    }

    public void printAB() {
        System.out.println("a : " + a);
        System.out.println("b : " + p);
    }
}

    class Demo05 {
        public static void main(String[] args) {
            //T a1 = null;
            T a1 = new U();//Legal
          //  U b1 = new T();//illegal

            a1.a = 100;
            //  a1.p=200; //illegal //Sub class ake thiyena dewal Super class aken accesss krnna ba
            a1.printT();
            // a1.printU();//Illegal

            U b1 = null;
            b1.a = 1000;
            b1.p = 2000;
            b1.printT();
            b1.printU();
        }
    }

