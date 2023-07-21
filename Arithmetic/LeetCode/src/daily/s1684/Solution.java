package daily.s1684;

/**
 *  1684. 统计一致字符串的数目
 */
class Solution {
    /**
     * 2021.04.22
     *
     * @param allowed
     * @param words
     * @return
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean isAdd = true;
            String[] split = word.split("");
            for (String s : split) {
                if (!allowed.contains(s)) {
                    isAdd = false;
                    break;
                }
            }
            if (isAdd) {
                count++;
            }
        }
        return count;
    }

    /**
     * 2022-11-08
     *
     * @param allowed
     * @param words
     * @return
     */
    public int countConsistentStrings2(String allowed, String[] words) {
        int count = 0;
        String[] split = allowed.split("");
        for (String word : words) {
            for (String s : split) {
                word = word.replaceAll(s, "");
            }
            if (word.length() == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new Solution().countConsistentStrings2("ab", new String[]{"aaab"});
    }
}