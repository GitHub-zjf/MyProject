package s1598;

import java.util.Stack;

/**
 *  1598. 文件夹操作日志搜集器
 */
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String log : logs) {
            if ("../".equals(log)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if ("./".equals(log)) {
                continue;
            } else {
                stack.push(log);
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String[] logs = new String[]{"d1/","../","../","../"};
        System.out.println(new Solution().minOperations(logs));
    }
}