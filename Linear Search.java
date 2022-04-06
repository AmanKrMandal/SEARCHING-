package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        int target = 4;
        int ans= linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

}


