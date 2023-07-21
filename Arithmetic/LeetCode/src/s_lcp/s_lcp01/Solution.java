package s_lcp.s_lcp01;


class Solution {
    public int game(int[] guess, int[] answer) {
        int result = 0;
        if (guess[0] == answer[0]) {
            result++;
        }
        if (guess[1] == answer[1]) {
            result++;
        }
        if (guess[2] == answer[2]) {
            result++;
        }
        return result;
    }
}


/*
import java.util.LinkedHashMap;
import java.util.Map;
// 第一个只出现一次的字符
class Solution {
	public char firstUniqChar(String s) {
		char ret = ' ';
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for(char key : map.keySet()){
			if(1 == map.get(key)){
				ret = key;
				break;
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().firstUniqChar("abaccdeff"));
	}
}*/