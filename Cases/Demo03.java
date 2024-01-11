package Cases;

class Test{
    public void myMethod(){
        System.out.println(this);//Current Values refer krnawaa..
    }
}
public class Demo03 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.myMethod();

        Test t2 = new Test();
        t2.myMethod();
    }
}
