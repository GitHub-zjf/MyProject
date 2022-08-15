package s0228;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<String> summaryRanges(int[] nums) {
		/**
		List<String> ret = new ArrayList<String>();
		if (nums.length == 0) {
			return ret;
		} else if(nums.length == 1){
			ret.add(nums[0]+"");
		} else {
			int begin = 0;
			int end = 0;
			for (int i = 1; i < nums.length; i++) {
				if(nums[i] - nums[i-1] == 1){
					end++;
				}else{
					ret.add(nums[begin] != nums[end] ? (nums[begin] + "->" + nums[end]) : (nums[begin]+ ""));
					begin = i;
					end = i;
				}
				if(end == nums.length-1){
					ret.add(nums[begin] != nums[end] ? (nums[begin] + "->" + nums[end]) : (nums[begin]+ ""));
				}
			}
		}
		return ret;
		**/
		
		List<String> ret = new ArrayList<String>();
		
		
		
		return ret;
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = new int[]{0,1,2,4,5,7};
		List<String> ret = solution.summaryRanges(nums);
		System.out.println(ret);
	}
}