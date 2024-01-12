package Constructor;

class Chair {
    int length;
    int weight;
    int height;

    Chair() {
        this(123);
        System.out.println("Chair()");
    }

    Chair(int length) {
        this(length, length,length);
        System.out.println("Chair(int)");
    }

    Chair(int length, int weight,int height) {
        this.length=length;
        this.weight=weight;
        this.height=height;
        System.out.println("Chair(int,int,int)");
    }
}

public class Demo08 {
    public static void main(String[] args) {
        Chair c1 = new Chair();
    }
}
