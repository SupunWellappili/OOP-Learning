package Static_Initialization;


class Sea {
    int a;
    static int b;
}

public class Demo03 {
    public static void main(String[] args) {
        //Sea.a = 123;//Object ake awa direct access krnna baa
        Sea.b = 321;//Template ake thiyena awa direct access krna puluwn.
        System.out.println(Sea.b);//321

        Sea s1 = new Sea();
        System.out.println(s1.b);//321

    }
}
