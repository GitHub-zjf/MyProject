package s0670;

/**
 * 670. ×î´ó½»»»
 */
class Solution {
    public int maximumSwap(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int n = chars.length;
        int maxNum = num;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(chars, i, j);
                maxNum = Math.max(maxNum, Integer.parseInt(new String(chars)));
                swap(chars, i, j);
            }
        }
        return maxNum;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}