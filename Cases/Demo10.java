package Cases;

class Box11 {
    int lenght;
    int weight;
    int height;

    public void volume() {
        int volume = lenght * weight * height;
        System.out.println("Volume : " + volume);
    }

    public void getVolume(int lenght, int weight, int height) {
        this.lenght = lenght;
        this.weight = weight;
        this.height = height;


        System.out.println("lenght :" + lenght);
        System.out.println("weight :" + weight);
        System.out.println("height :" + height);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        Box11 b1 = new Box11();
        b1.volume();

        System.out.println("=============");

        Box11 b2 = new Box11();
        b2.volume();

        System.out.println("=============");

        b1.getVolume(13, 54, 65);

        System.out.println("=============");

        b2.getVolume(1, 2, 3);
        System.out.println("=============");

        b1.volume();
        b2.volume();
    }
}
