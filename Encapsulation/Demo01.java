package Encapsulation;

import javax.swing.*;

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
        if (salary < 0) {
            JOptionPane.showConfirmDialog(null, "Wrong Input");
            return;
        }
        this.salary = salary;
    }

    public void showData() {
        System.out.println("ID --> " + id + "\tName--> " + name + "\tAddress--> " + address + "\tSalary--> " + salary);
    }

    public Customer(int id, String name, String address, double salary) {
        if (salary < 0) {
            JOptionPane.showConfirmDialog(null, "Wrong Input");
            return;
        }
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Customer() {
    }

    @Override
    public String toString() {//Address ake Details tika Print wenawa..
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Demo01 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setId(001);
        c1.setName("Supun");
        c1.setAddress("Galle");
        c1.setSalary(35000.7545);
        c1.showData();

        System.out.println("--------");

        Customer c2 = new Customer();
        c2.setId(002);
        c2.setName("Wellappili");
        c2.setAddress("Kataragama");
        c2.setSalary(76000.545);
        c2.showData();

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getAddress());
        System.out.println(c1.getSalary());

        System.out.println("--------");

        System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getAddress());
        System.out.println(c2.getSalary());


        System.out.println(c1);
        System.out.println(c2);
    }
}
