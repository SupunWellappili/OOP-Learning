package Inheritance;

class AA {

    int a;

    AA() {
        System.out.println("A()");
    }

    AA(int a) {
        System.out.println("A(int a)");
    }

    AA(int a, int b) {
        System.out.println("A(int a, int b)");
    }
}

class BB extends AA { //Super Constructor Call wenawaa//

    int b;

    BB() {
        System.out.println("B()");
    }

    BB(int a) {
        System.out.println("B(int a)");
    }

    BB(int a, int b) {
        System.out.println("B(int a, int b)");
    }
}

class Demo03 {
    public static void main(String[] args) {
        new BB();
        System.out.println("==========");

        new BB(10);
        System.out.println("==========");

        new BB(10, 20);
        System.out.println("==========");
    }
}