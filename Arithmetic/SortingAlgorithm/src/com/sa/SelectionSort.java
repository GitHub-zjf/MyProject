package com.sa;

/**
 * 选择排序
 * 每次记录最小（大）的数，将其和数组的开头（末尾）进行交换
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arrays) {
        if (arrays.length <= 0) {
            return arrays;
        }

        for (int i = 0; i < arrays.length; i++) {
            int minIndex = i;
            for (int j = i; i < arrays.length; j++) {
                if (arrays[j] < arrays[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arrays[minIndex];
            arrays[minIndex] = arrays[i];
            arrays[i] = temp;
        }

        return arrays;
    }
}
