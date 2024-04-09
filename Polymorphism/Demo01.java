package Polymorphism;


class Vehicle {
    public void park() {
        System.out.println("Vehicle Parking(00.00)");
    }

    public void pay() {
        System.out.println("Vehicle Payment");
    }
}

class Car extends Vehicle {
    public void park() {
        System.out.println("Car Parking(50)");
    }

    public void pay() {
        System.out.println("Car Payment");
    }
}

class Van extends Vehicle {
    public void park() {
        System.out.println("Van Parking(50)");
    }

    public void pay() {
        System.out.println("Van Payment");
    }

}

class Bus extends Vehicle {
    public void park() {
        System.out.println("Bus Parking(100)");
    }

    public void pay() {
        System.out.println("Bus Payment");
    }
}


class Demo01 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
        v1.pay();

        System.out.println("==========");

        v1 = new Van();
        v1.park();
        v1.pay();

        System.out.println("==========");

        v1 = new Bus();
        v1.park();
        v1.pay();


    }
}
