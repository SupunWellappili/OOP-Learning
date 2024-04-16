package Exception;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("Start Main");
        int x = 10;
        try {
            System.out.println("Start Try");
            int y = x / 0;
            System.out.println("End Try");

        } catch (Exception e) {
            System.out.println("Start Catch");
            System.out.println(e);
            System.out.println("End Catch");

        }
        System.out.println(x);
        System.out.println("End Main");
    }
}
