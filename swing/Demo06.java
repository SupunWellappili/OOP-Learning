package swing;

class Cylinder {

    double length;
    double radius;

    public void setSize(double l, double r) {
        radius = r;
        length = l;
    }

    public void printVolume() {
        double volume = Math.PI * radius * radius * length;
        System.out.println("Volume is : " + volume);
    }

    public void printArea() {
        double area = 2*Math.PI*radius*length;
        System.out.println("Area is : " + area);
    }
}

public class Demo06 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setSize(12.5, 2.5);
        c1.printVolume();
        c1.printArea();
    }
}

//Math.PI-->22/7
//Area---->2PIrh
//Volume --> PIr2h
