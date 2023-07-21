package daily.s0540;
class Solution {
    public int singleNonDuplicate(int[] nums) {
    	int ret = nums[0];
    	for(int i=1;i<nums.length;i++){
    		ret ^= nums[i];
    	}
    	return ret;
    }
}