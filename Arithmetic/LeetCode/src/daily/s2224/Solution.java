package daily.s2224;

/**
 * 2224. 转化时间需要的最少操作数
 */
class Solution {
    public int convertTime(String current, String correct) {
        int num = 0;
        String[] cur = current.split(":");
        String[] cor = correct.split(":");
        // 转换成分钟差异
        int curMin = Integer.valueOf(cur[0]) * 60 + Integer.valueOf(cur[1]);
        int corMin = Integer.valueOf(cor[0]) * 60 + Integer.valueOf(cor[1]);
        int minutes = corMin - curMin;
//        while (minutes > 0) {
//            if (minutes >= 60) {
//                num += minutes / 60;
//                minutes %= 60;
//            } else if (minutes >= 15) {
//                num += minutes / 15;
//                minutes %= 15;
//            } else if (minutes >= 5) {
//                num += minutes / 5;
//                minutes %= 5;
//            } else {
//                num += minutes;
//                break;
//            }
//        }
//        return num;
        return minutes / 60 + (minutes % 60) / 15 + (minutes % 60 % 15) / 5 + minutes % 60 % 15 % 5;
    }

    public static void main(String[] args) {
        String current = "09:41", correct = "10:34";
        System.out.println(new Solution().convertTime(current, correct));
    }
}