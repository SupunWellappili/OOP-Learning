package Polymorphism;


abstract class IPhone1 { //Concrete Class
    String model = "IPhone1";

    public void call() { //Concrete Method
        System.out.println("Calling");
    }

    abstract public void sendMessage(); //Abstract Method (Implementation akak nee (Body akak na))
}

 class IPhone2 extends  IPhone1{

     @Override
     public void sendMessage() {

     }
 }

