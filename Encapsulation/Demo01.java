package Encapsulation;

class Customer {
    int id;
    String name;
    String address;
    double salary;

    public void showData() {
        System.out.println("ID --> " + id + "\tName--> " + name + "\tAddress--> " + address + "\tSalary--> " + salary);
    }

}

public class Demo01 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.id = 001;
        c1.name = "Supun";
        c1.address = "Galle";
        c1.salary = 35000;
        c1.showData();

        System.out.println("--------");

        Customer c2 = new Customer();
        c2.id = 002;
        c2.name = "Wellappili";
        c2.address = "Kataragama";
        c2.salary = 75000;
        c2.showData();


    }
}
