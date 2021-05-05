package Work.HomeWorke3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        int a = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = arr[i][a - i] = 1;
         System.out.println(Arrays.toString(arr[i]));
        }
    }
}
