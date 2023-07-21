package daily.s0507;

class Solution {
	public boolean checkPerfectNumber(int num) {
		
		if(num == 1) return false;
		int sum = 0;
		for(int i=1;i*i<=num;i++){
			int j = num % i;
			if(j == 0){
				sum += i;
				sum += (num / i);
			}
		}
		return num == (sum - num) ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().checkPerfectNumber(8128));
	}
}