package swing;

class Wall {
    double width;
    double height;
    double length;

    public void setSize(double w, double h, double l) {
        width = w;
        height = h;
        length = l;

    }

    public void printVolume() {
        double volume = width * height * length;
        System.out.println("Volume is : " + volume);

    }

    public void printArea() {
        double area = 2*(width * height) + 2*(width * length) + 2*(height * length);
        System.out.println("Area is : " + area);

    }
}

public class Demo04 {
    public static void main(String[] args) {

        Wall b1 = new Wall();
        b1.setSize(12, 5, 4);
        b1.printVolume();//240
        b1.printArea();//222
    }
}
