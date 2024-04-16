package Abstraction;

interface GoodGirl {
    void kiss();
}

class Girl implements GoodGirl {
    public void kiss() {
        System.out.println("Ummaaaahh!!!");
    }
}

class Boy {
    public void kissGirl() {
        while (true) {
            //new Girl().kiss();
            GoodGirl g1 = new Girl();
            g1.kiss();
        }
    }
}

public class Demo02 {
    public static void main(String[] args) {
        new Boy().kissGirl();
    }
}
