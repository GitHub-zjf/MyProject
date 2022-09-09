package s1598;

/**
 *  1598. �ļ��в�����־�Ѽ���
 */
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if ("../".equals(log)) {
                if (depth > 0) {
                    depth--;
                }
            } else if ("./".equals(log)) {
                continue;
            } else {
                depth++;
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        String[] logs = new String[]{"d1/","../","../","../"};
        System.out.println(new Solution().minOperations(logs));
    }
}