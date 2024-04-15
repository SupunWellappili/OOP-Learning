package Access_Privileges;

class AAAA {
    public AAAA get() {
        return new AAAA();
    }
}


class BBBB extends AAAA {
    public AAAA get() {
        return new AAAA();
    }
}


class Demo03 {
    public static void main(String[] args) {
        AAAA a1 = new AAAA();
        System.out.println(a1.get());

        a1= new BBBB();
        System.out.println(a1.get());
    }
}

//Override krma return type object ake super class return type wiyauthumai...