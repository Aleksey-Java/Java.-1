package Work.HomeWorke3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int length = 7;
        int initialValue = 11;
        int[] arr = a(length, initialValue);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] a(int length, int initialValue) {
        int[] arr = new int[initialValue];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = length;
        }
        return arr;
    }
}