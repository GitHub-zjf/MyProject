package s1662;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        /**
         StringBuffer word_one = new StringBuffer();
         StringBuffer word_two = new StringBuffer();

         for (String word : word1) {
         word_one.append(word);
         }
         for (String word : word2) {
         word_two.append(word);
         }

         return word_one.toString().equals(word_two.toString());
         **/
        return String.join("", word1).toString().equals(String.join("", word2));
    }

    /**
     *  °¤¸ö×Ö·û±È½Ï
     * @param word1
     * @param word2
     * @return
     */
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        int p = 0, q = 0, i = 0, j = 0;
        while (p < word1.length && q < word2.length) {
            if (word1[p].charAt(i) != word2[q].charAt(j)) {
                return false;
            }
            i++;
            if (i == word1[p].length()) {
                p++;
                i = 0;
            }
            j++;
            if (j == word2[q].length()) {
                q++;
                j = 0;
            }
        }
        return p == word1.length && q == word2.length;
    }

    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "cd"};
        String[] word2 = new String[]{"a", "bcd"};
        System.out.println(new Solution().arrayStringsAreEqual(word1, word2));
    }
}