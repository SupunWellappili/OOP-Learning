package Instance_Blocks;

class Chair {
    public static void mA(){//Static Method
        System.out.println("mA()");
    }

    public void mB(){//Instance Method
        System.out.println("mB()");
    }
}

public class Demo04 {
    public static void main(String[] args) {
        Chair.mA();//Legal
        //Chair.mB();//Illegal

        Chair c1 = new Chair();
        c1.mB();//Legal
    }
}
