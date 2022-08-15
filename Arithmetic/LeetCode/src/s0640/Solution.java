package s0640;

class Solution {
    public String solveEquation(String equation) {
        // 等号分割，对两边分别进行处理
        String[] eqs = equation.split("=");

        // 左边
        String[] leftEq = eqs[0].replace("-", "+-").split("\\+");
        // 右边
        String[] rightEq = eqs[1].replace("-", "+-").split("\\+");

        // 等式左边 -- 统计x的格式
        int left = 0;
        // 等式右边 -- 统计常量
        int right = 0;

        for (String l : leftEq) {
            if (l.equals("x")) {
                left += 1;
            } else if (l.equals("-x")) {
                left += -1;
            } else if (l.contains("x")) {
                // 切割出x前面的系数
                left += Integer.parseInt(l.substring(0, l.length() - 1));
            } else if(!l.equals("")){
                right -= Integer.parseInt(l);
            }
        }

        for (String r : rightEq) {
            if (r.equals("x")) {
                left -= 1;
            } else if (r.equals("-x")) {
                left -= -1;
            } else if (r.contains("x")) {
                left -= Integer.parseInt(r.substring(0, r.length() - 1));
            } else if(!r.equals("")){
                right += Integer.parseInt(r);
            }
        }

        if (left == 0) {
            if (right == 0) {
                return "Infinite solutions";
            }
            return "No solution";
        }

        return "x=" + right / left;
    }

    public static void main(String[] args) {
        String equation = "2x=x";
        System.out.println(new Solution().solveEquation(equation));
    }
}