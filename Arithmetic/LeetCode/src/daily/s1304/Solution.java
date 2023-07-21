package daily.s1304;

/**
 * 1304. ��Ϊ��� N ����ͬ����
 */
class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n / 2; i++) {
            ans[i] = i + (n / 2) * -1;
            ans[i + n / 2] = i + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ints = new Solution().sumZero(7);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}