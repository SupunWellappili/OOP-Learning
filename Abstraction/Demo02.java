package Abstraction;


class Girl {
    public void kiss() {
        System.out.println("Ummaaaahh!!!");
    }
}

class Boy {
    public void kissGirl() {
        while (true) {
            new Girl().kiss();
        }
    }
}

public class Demo02 {
    public static void main(String[] args) {
        new Boy().kissGirl();
    }
}
