package s0012;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Solution {
	
	static Map<Integer, String> map = new LinkedHashMap<>();
	
	static {
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
	}
	
    public String intToRoman(int num) {
    	String result = map.get(num);
    	Set<Integer> keys = map.keySet();
    	if(null == result){
    		result = "";
			for(int key : keys){
				int temp = num / key;
				num = num % key;
				for(int i=0;i<temp;i++){
					result += map.get(key);
				}
			}
    		return result;
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		 System.out.println(new Solution().intToRoman(101));
	}
}