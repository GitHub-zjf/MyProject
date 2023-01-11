package s2042;

/**
 * 2042. �������е������Ƿ����
 */
class Solution {
    public boolean areNumbersAscending(String s) {
        String[] sArr = s.split(" ");
        int pre = -1;
        for (String str : sArr) {
            if (str.matches("^([1-9]|[1-9][0-9]|[1-9][0-9][0-9])$")) {
                int parseInt = Integer.parseInt(str);
                if (parseInt <= pre) {
                    return false;
                } else {
                    pre = parseInt;
                }

            }
        }
        return true;
    }
}