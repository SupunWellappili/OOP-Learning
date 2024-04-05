package Encapsulation;

class Customer {
    private int id;
    private String name;
    private String address;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0) return;
        this.salary = salary;
    }

    public void showData() {
        System.out.println("ID --> " + id + "\tName--> " + name + "\tAddress--> " + address + "\tSalary--> " + salary);
    }

}

public class Demo01 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setId(001);
        c1.setName("Supun");
        c1.setAddress("Galle");
        c1.setSalary(35000);
        c1.showData();

        System.out.println("--------");

        Customer c2 = new Customer();
        c2.setId(002);
        c2.setName("Wellappili");
        c2.setAddress("Kataragama");
        c2.setSalary(75000);
        c2.showData();


    }
}
