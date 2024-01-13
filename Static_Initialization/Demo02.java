package Static_Initialization;

class TestOne {
    int a;
    static int b;
}

public class Demo02 {
    public static void main(String[] args) {
        // TestOne.a = 123;;//Legal, b is a static variable(Class variable)
        TestOne.b = 321;//Illegal, a is ab instance variable(Object variables,Attributes)
    }
}
