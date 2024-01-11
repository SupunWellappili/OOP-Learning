package Constructor;


class Test {
    int length;
    int weight;
    int height;

    public Test() {
        length = 10;
        weight = 10;
        height = 10;
    }

    public Test getCopy() {
        return this;
    }
}

public class Demo01 {
    public static void main(String[] args) {
        // Test test = new Test()//Constructor Calling

        Test test = new Test();
        System.out.println(test.height);//10
        System.out.println(test.weight);//10
        System.out.println(test.length);//10

        System.out.println(test);//Object Address
        System.out.println(test.hashCode());//trust object Address
    }
}
