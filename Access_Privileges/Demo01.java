package Access_Privileges;


class A{
      protected void get(){

    }
}

class B extends A{
      public void get(){

    }
}

public class Demo01 {


}

//public --> public
//protected --> public | protected
//default --> public | protected | default
//private --> Not Override
