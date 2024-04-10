package Method_Overring;

class Vehicle{
    static public void park(){
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle{
     static public void park(){
        System.out.println("Car Parking");
    }
}

class Demo03{
    public static void main(String[] args) {
        Vehicle v1= new Car();
        v1.park();
        v1 = new Vehicle();
        v1.park();

    }
}