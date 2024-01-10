package swing;
class Box {
    int width;
    int height;
    int length;

    public void setSize(int w, int h, int l) {
        width =w;
        height =h;
        length =l;
    }

    public void printVolume() {
        int volume = width*height*length;
        System.out.println("Volume is : "+ volume);
    }
}

public class Demo03 {
    public static void main(String[] args) {
        Box f1 = new Box();
        f1.setSize(12, 5, 4);
        f1.printVolume();
    }
}
