package Exception;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println("Start Main");

        try {
            int x = 10 / 2;
            int[] xr = new int[10];
            xr[50] = 100;
        } catch (ArithmeticException | IndexOutOfBoundsException e) { //Catch Ladder
            e.printStackTrace();
        } /*catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }*/

        finally {
            System.out.println("finally");
        }
        System.out.println("End Main");
    }
}
