package daily.s0008;

class Solution {
    public int myAtoi(String s) {
        // true为正，false为负数
        boolean flag = true;

        s = s.trim();
        if (s.length() <= 0) {
            return 0;
        }
        if (s.charAt(0) == '-') {
            flag = false;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            flag = true;
            s = s.substring(1);
        }
        long ans = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                if (flag) {
                    ans = ans * 10 + (chars[i] - '0');
                    if (ans > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    ans = ans * 10 - (chars[i] - '0');
                    if (ans < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                }
            } else {
                break;
            }
        }


        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi(" -000000000000013465888"));
    }

}