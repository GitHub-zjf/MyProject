package com.sa;

/**
 *  冒泡排序
 *   每次比较相邻的两个数，如果A<B则交换位置，经历一次循环后，最大的数在数组末尾
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length <= 0) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
