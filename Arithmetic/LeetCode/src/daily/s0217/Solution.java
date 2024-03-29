package daily.s0217;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    	Set<Integer> set = new HashSet<>();
    	for(int num:nums){
    		set.add(num);
    	}
    	return set.size() != nums.length;
    }
}