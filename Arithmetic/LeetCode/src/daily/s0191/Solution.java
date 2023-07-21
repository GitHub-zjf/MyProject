package daily.s0191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().hammingWeight(-3));
	}
}
