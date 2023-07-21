package daily.s1678;

import java.util.HashMap;
import java.util.Map;

class Solution {

	public static Map<String, String> map = new HashMap<String, String>();

	static {
		map.put("G", "G");
		map.put("()", "o");
		map.put("(al)", "al");
	}

	public String interpret2(String command) {
		char[] charArray = command.toCharArray();
		String result = "";
		String temp = "";
		for (char c : charArray) {
			temp = temp + String.valueOf(c);
			String value = map.get(temp);
			if (null != value) {
				result += value;
				temp = "";
			}
		}
		return result;
	}
	
	public String interpret(String command) {
		command = command.replace("()", "o");
		command = command.replace("(al)", "al");
		return command;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().interpret("(al)G(al)()()G"));
	}
}