package Cases;

class Value {
    int height;
    double weight;
    int length;

    public void myValue(int height, double weight, int length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }
}

public class Demo04 {
    public static void main(String[] args) {
        Value v1 = new Value();
        v1.myValue(1250, 665.45, 765);
        System.out.println(v1.height);
        System.out.println(v1.weight);
        System.out.println(v1.length);
    }
}
