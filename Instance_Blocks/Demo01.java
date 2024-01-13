package Instance_Blocks;
class test {
    int height;
    int weight;
    int length;

    {
        height = 100;
        weight = 200;
        length = 300;
    }

    public  void printVolume() {
        int volume = weight * length * height;
        System.out.println("Volume -: "+volume);
    }
}

public class Demo01 {
    public static void main(String[] args) {
        test t1 = new test();
        t1.printVolume();
    }
}
