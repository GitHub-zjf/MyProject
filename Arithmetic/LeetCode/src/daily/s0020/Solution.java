package daily.s0020;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		char[] cs = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		String left = "{([";
		String right = "})]";
		for (int i = 0; i < cs.length; i++) {
			if (stack.size() == 0) {
				stack.add(cs[i]);
			} else {
				if (left.indexOf(stack.lastElement())!=-1 && right.indexOf(cs[i]) == left.indexOf(stack.lastElement())) {
					stack.pop();
				}else{
					stack.add(cs[i]);
				}
			}
		}
		return (stack.size() == 0);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		long startTime = System.currentTimeMillis(); 			//��ȡ��ǰʱ��
		System.out.println(solution.isValid(""));
		long endTime = System.currentTimeMillis();
		System.out.println("��������ʱ�䣺"+(endTime-startTime)+"ms");
	}
}