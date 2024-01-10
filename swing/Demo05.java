package swing;

class Boxes {

    int length;
    int height;
    int width;

    public void setSize(int l, int h, int w) {
        length = l;
        height = h;
        width = w;
    }

    public void printVolume() {
        int volume = length * height * width;
        System.out.println("Volume is : " + volume);
    }

    public void printArea() {
        int area = 2 * (length * height) + 2 * (length * width) + 2 * (height * width);
        System.out.println("Area is : " + area);
    }

    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getVolume() {
        int volume = length * height * width;
        return volume;
    }

    public int getArea() {
        int area = 2 * (length * height) + 2 * (length * width) + 2 * (height * width);
        return area;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}

public class Demo05 {
    public static void main(String[] args) {
        Boxes b1 = new Boxes();
        b1.setSize(12, 5, 3);
        b1.printVolume();
        b1.printArea();

        b1.setLength(120);
        b1.setWidth(50);
        b1.setHeight(30);

        int vol = b1.getVolume();
        System.out.println("New Volume of the box : " + vol);//180000

        int area = b1.getArea();
        System.out.println("New Area of the boxes :" + area);//22200


        System.out.println("New length : " + b1.getLength());//120
        System.out.println("New Width : " + b1.getWidth());//50
        System.out.println("New Height : " + b1.getHeight());//30
    }
}
