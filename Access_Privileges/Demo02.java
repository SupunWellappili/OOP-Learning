package Access_Privileges;

class AAA {
    public int get() {
        return 10;
    }
}


class BBB extends AAA {
    public int get() {
        return 20;
    }
}


class Demo02 {
    public static void main(String[] args) {
        AAA a1 = new AAA();
        System.out.println(a1.get());

        a1= new BBB();
        System.out.println(a1.get());
    }
}


//Override krma return type ake super class return type wiyauthumai