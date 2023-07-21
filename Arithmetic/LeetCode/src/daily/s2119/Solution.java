package daily.s2119;

/**
 * @author zhengjianfeng
 * 反转两次的数字
 */
class Solution {
    public boolean isSameAfterReversals(int num) {
        /*
        if(num < 10){
            return true;
        }
        return !String.valueOf(num).endsWith("0");
        */
        return num == 0 || num % 10 != 0;
    }
}