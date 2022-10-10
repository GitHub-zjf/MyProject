package s1694;

/**
 * 1694. 重新格式化电话号码
 *
 * 字符串拼接耗时8ms， 使用sb耗时1ms
 */
class Solution {
    public String reformatNumber(String number) {
        number = number.replace("-", "").replace(" ", "");
        int len = number.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (len > 4) {
            sb.append(number.substring(i, i + 3));
            sb.append("-");
            len = len - 3;
            i = i + 3;
        }
        if (len == 3 || len == 2) {
            sb.append(number.substring(i, i + len));
        } else {
            sb.append(number.substring(i, i + 2));
            sb.append("-");
            sb.append(number.substring(i + 2, i + 4));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reformatNumber("1-23-43- 4435"));
    }
}