package Constructor;


class QQQ{
    int a =100;
    QQQ(){
        a=500;
    }

    /*QQQ(){
        a=100;
        a=500;
    }*/
}
public class Demo11 {
    public static void main(String[] args) {
        QQQ q1 = new QQQ();
        System.out.println(q1.a);

    }
}
