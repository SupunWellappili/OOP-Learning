package Abstraction;


abstract class IPhone1 {
    String model = "IPhone1";

    public void call() {
        System.out.println("calling......");
    }

    abstract public void sendMessage();
}


abstract class IPhone2 extends IPhone1 {
}

class IPhone3 extends IPhone2 {
    public void sendMessage() {
        //-------------
    }
}

//Complicity / implementation aka hide krnawa.

