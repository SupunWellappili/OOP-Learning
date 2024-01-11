package Cases;
class Box{

    int height;
    int weight;
    int length;

    public void setSize(int height, int weight,int length){
        this.height=height;
        this.weight =weight;
        this.length =length;
    }

    public void printValue(){
        int volume = height*weight*length;
        System.out.println("Volume is -: "+volume);
    }
}

public class Demo05 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setSize(12,5,3);

        Box b2 = new Box();
        b2.setSize(120,50,30);

        b1.printValue();//180
        b2.printValue();//180000
        System.out.println(b1==b2);//False

        System.out.println("----------------");

        b1=b2;

        b1.printValue();
        b2.printValue();
        System.out.println(b1==b2);//True
    }
}
