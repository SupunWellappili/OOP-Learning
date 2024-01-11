package Cases;

import java.util.Random;
import java.util.Scanner;

class Type {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
    Random i;
    Scanner j;
    int[] k;
    String l;
}

public class Demo02 {
    public static void main(String[] args) {
        Type t1 = new Type();
        System.out.println("byte-: "+t1.a);
        System.out.println("short-: "+t1.b);
        System.out.println("int-: "+t1.c);
        System.out.println("long-: "+t1.d);
        System.out.println("float-: "+t1.e);
        System.out.println("double-: "+t1.f);
        System.out.println("char-: "+t1.g);
        System.out.println("boolean-: "+t1.h);
        System.out.println("Random-: "+t1.i);
        System.out.println("Scanner-: "+t1.j);
        System.out.println("int[]-: "+t1.k);
        System.out.println("String-: "+t1.l);

    }
}
