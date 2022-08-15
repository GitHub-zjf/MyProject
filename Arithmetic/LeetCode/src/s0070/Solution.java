package s0070;

class Solution {
	// timeout
	/*
	 * public int climbStairs(int n) { if (n <=3 ) return n; return
	 * climbStairs(n - 1) + climbStairs(n - 2); }
	 */
	public int climbStairs(int n) {
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 2;
		for (int i = 2; i < n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n-1];
	}

	public static void main(String[] args) throws Exception {
		System.err.println(new Solution().climbStairs(1));
	}
}
/**
4 

1 + 1 + 1 + 1
1 + 1 + 2
1 + 2 + 1

2 + 1 + 1
2 + 2

5 
1 + 1 + 1 + 1 + 1 
1 + 1 + 1 + 2
1 + 1 + 2 + 1
1 + 2 + 1 + 1
1 + 2 + 2

2 + 1 + 1 + 1
2 + 1 + 2
2 + 2 + 1

*/