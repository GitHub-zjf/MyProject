package daily.s0278;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
	
	public int firstBadVersion(int n) {
		int left = 1;
		int mid = left + (n - left) / 2;
		
		while (left < n) {
			if(isBadVersion(mid)){
				n = mid;
			}else{
				left = mid + 1;
			}
			mid = left + (n - left) / 2;
		}
		return left;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().firstBadVersion(6));
	}
	
}

class VersionControl {
	boolean isBadVersion(int version){
		return version == 3;
	}
}