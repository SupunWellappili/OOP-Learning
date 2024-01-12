package Constructor;

class Table {
    int weight;
    int length;
    int height;

    public void Table(int height, int length, int weight) {
        this.height = height;
        this.length = length;
        this.weight = weight;
        System.out.println("Method");
    }

    public void printVolume(){
        Table(34,54,21);
        int volume =length*weight*height;
        System.out.println("Volume -: "+volume);
    }

    Table(int qq) {
        System.out.println("Table(int qq)");
    }

    Table() {
        System.out.println("Table()");
    }

}

public class Demo06 {
    public static void main(String[] args) {
        Table table = new Table();
        table.Table(12, 67, 86);

        Table tablel = new Table(54);
        tablel.printVolume();
    }
}
