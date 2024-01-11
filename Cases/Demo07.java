package Cases;

 class Tests {
    int height;
    int weight;
    int length;

    public void setSize(int height, int weight, int length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    public Tests getCopy() {
        /*Tests t = new Tests();
        t.height=this.height;
        t.weight=this.weight;
        t.length=this.length;
        return t;*/
        Tests tt = new Tests();
        tt.setSize(height, length, weight);
        return tt;
    }

    public void printVolume() {
        int volume = length * weight * height;
        System.out.println("Volume -: " + volume);
    }
}

public class Demo07 {
    public static void main(String[] args) {
        Tests t1 = new Tests();
        t1.setSize(12, 5, 3);

        Tests t2 = t1.getCopy();
        System.out.println(t1 == t2);//False
        t1.printVolume();//180
        t2.printVolume();//180
    }
}
