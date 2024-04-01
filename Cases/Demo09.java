package Cases;

class Box1 {
    int x;

    public void setValue(int number) {
        x = number;
    }

    public void printValue() {
        System.out.println(x);
    }
}


class Demo09 {
    public static void main(String[] args) {
        Box1 b1 = null;
        b1.x = 100;
    }
}

