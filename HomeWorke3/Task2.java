package Work.HomeWorke3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arry = new int[100];
        for (int i = 0; i < 100; i++) {
            arry[i] = i + 1;
            System.out.println(Arrays.toString(arry));
        }
    }
}