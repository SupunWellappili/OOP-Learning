package Exception;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("Start Main");
        int x = 10;
        try {
            int y = x / 0;
           // int y = x / 2;

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(x);
        System.out.println("End Main");
    }
}
