package daily.s1769;

import java.util.ArrayList;
import java.util.List;

/**
 *  1769. 移动所有球到每个盒子所需的最小操作数
 */
class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] ans = new int[len];
        // 记住所有1的位置
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (boxes.charAt(i) == '1') {
                list.add(i);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int c : list) {
                ans[i] += Math.abs(c - i);
            }
        }

        return ans;
    }

    public int[] minOperations2(String boxes) {
        int len = boxes.length();
        int left = boxes.charAt(0) - '0', right = 0, operations = 0;

        for (int i = 1; i < len; i++) {
            if (boxes.charAt(i) == '1') {
                operations += i;
                right++;
            }
        }

        int[] ans = new int[len];
        ans[0] = operations;
        for (int i = 1; i < len; i++) {
            operations = operations + left - right;
            if (boxes.charAt(i) == '1') {
                left++;
                right--;
            }
            ans[i] = operations;
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution().minOperations("110");
    }
}