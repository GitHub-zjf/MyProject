package s0477;

/**
 * 477. ���������ܺ�
 * ��λͳ��
 */
class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0, n = nums.length;
        for (int i = 0; i < 30; i++) {
            int c = 0;
            for (int num : nums) {
                c += (num >> i) & 1;
            }
            ans += c * (n - c);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(3 & 1);
    }
}