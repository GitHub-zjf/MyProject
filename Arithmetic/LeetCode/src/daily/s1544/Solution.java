package daily.s1544;

import java.util.Stack;

class Solution {
	public String makeGood(String s) {
		char[] chars = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		stack.push(chars[0]);
		for (int i = 1; i < chars.length; i++) {
			if (stack.isEmpty()) {
				stack.push(chars[i]);
			} else {
				char first = stack.lastElement();
				if ((chars[i] ^ first) == 32) {
					stack.pop();
				} else {
					stack.push(chars[i]);
				}
			}
		}
		String ret = "";
		while (!stack.isEmpty()) {
			ret = stack.pop() + ret;
		}
		return ret;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().makeGood("leEeetcode"));
	}
}