package Inheritance;

class AAA {
    int a;
    static int b = 200;

    AAA() {
        this(b);
    }

    AAA(int i) {
    }
}


//this keyword this(a),this(b)
class BBB extends AAA {
    int x = 100;
    static int y = 200;

    BBB(int i) {
        super(y);
    }
}