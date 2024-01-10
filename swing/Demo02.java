package swing;

import javax.swing.*;

public class Demo02 {
    public static void main(String[] args) {
        /*int length;
        int height;
        int width;*/
        JFrame f1 = new JFrame();

        /*length = 12;
        height = 5;
        width = 4;*/
        f1.setSize(12,5,4);

       // int volume = length * height * width;
        System.out.println("Box Volume Is : " + volume);
        printVolume();

    }
}
