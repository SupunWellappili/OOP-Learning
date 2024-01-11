package Constructor;


 class Testt {
    int height;
    int width;
    int length;

    public Testt(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public void printVolume() {
        int volume;
        volume = height * width * length;
        System.out.println("Volume of the Box is : " + volume);
    }
}

public class Demo02 {
    public static void main(String[] args) {
        Testt t1 = new Testt(12, 5, 3);
        System.out.println(t1.height);//12
        System.out.println(t1.length);//5
        System.out.println(t1.width);//3
        t1.printVolume();//180
    }
}



