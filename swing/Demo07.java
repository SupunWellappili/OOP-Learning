package swing;

class Data {
    int year;
    int month;
    int date;

    public void setDate(int y, int m,int d) {
        year =y;
        month=m;
        date=d;
    }
    public void printDate(){
        System.out.println(year+"-"+month+"-"+date);
    }

    public void setYear(int y){
        year=y;
    }

    public void setMonth(int m){
        month=m;
    }

    public void setDay(int d){
        date=d;
    }
}


public class Demo07 {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.setDate(2024, 01, 10);
        d1.printDate();//2024-1-10

        d1.setYear(1995);
        d1.setMonth(11);
        d1.setDay(01);

        d1.printDate();//1995-11-1
    }
}
