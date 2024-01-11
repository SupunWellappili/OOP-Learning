package Cases;

class Home {
    int height;
    int width;
    int length;

    public void setSize(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void setSize(Home home) {
        length = home.length;
        width = home.width;
        height = home.height;
    }

    public void printVolume() {
        int volume = length * width * height;
        System.out.println("Volume-: "+volume);
    }

   /* public void copyValuesFrom(Box box) {

    }*/
}

public class Demo06 {
    public static void main(String[] args) {
        Home b1 = new Home();
        b1.setSize(12, 5, 3);

        Home b2 = new Home();
        b2.setSize(120, 50, 30);

        b1.printVolume();
        b2.printVolume();
        System.out.println(b1 == b2);//False

        System.out.println("///////////////////");

        b1.setSize(b2); //b1.copyValuesFrom(b2);

        b1.printVolume();
        b2.printVolume();
        System.out.println(b1 == b2);//False
    }
}
