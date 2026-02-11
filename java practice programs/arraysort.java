package pst;

import java.util.Arrays;

class ArraySort {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 6};

        Arrays.sort(arr);

        System.out.println("Ascending order:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Descending order:");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
