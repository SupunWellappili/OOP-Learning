package Static_Initialization;


class Example {
    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Instance Block");
    }

    public Example() {
        System.out.println("Constructor");
    }
}

public class Demo04 {
    public static void main(String[] args) {
       Example e1 = new Example();
        System.out.println("======");
       Example e2 = new Example();

    }
}
