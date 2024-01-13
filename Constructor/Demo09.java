package Constructor;


class DDD {
    int a = 100;
   /* int a;
    DDD(){
         a=100;
    }*/
}

class Demo09 {
    public static void main(String[] args) {
        DDD d1 = new DDD();
        System.out.println(d1.a);

        DDD d2 = new DDD();
        System.out.println(d2.a);
    }
}