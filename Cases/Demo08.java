package Cases;


    class Testss {
        int height;
        int weight;
        int length;

        public void setSize(int height, int weight, int length) {
            this.height = height;
            this.weight = weight;
            this.length = length;
        }

        public Testss getCopy() {
            return this;
        }

        public void printVolume() {
            int volume = length * weight * height;
            System.out.println("Volume -: " + volume);
        }
    }

    public class Demo08 {
        public static void main(String[] args) {
            Testss t1 = new Testss();
            t1.setSize(12, 5, 3);

            Testss t2 = t1.getCopy();
            System.out.println(t1 == t2);//true
            t1.printVolume();//180
            t2.printVolume();//180
        }
    }

