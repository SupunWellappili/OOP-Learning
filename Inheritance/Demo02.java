package Inheritance;


class A {
    int a;

    static {
        System.out.println("Static Block A");
    }

    public void printA(){
        System.out.println("a : " + a);
    }
}

class B extends A { //Super class akee edan Sub class akatai inherit wenne..
    int b;

    static {
        System.out.println("Static Block B");
    }

    public void printB() {
        System.out.println("b : " + b);
    }
}

class Example {
    public static void main(String[] args) {
        new B();//Anonymous object,
        // create krna object aka reference akata asign kra ganne nethnam use krnawanm pamanak nam,
        // Object akak na RAM ake create wenawa create unu gaman nethi wela yanawa..
    }
}
