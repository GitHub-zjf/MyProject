package daily.s2287;

/**
 *  2287. 重排字符形成目标字符串
 */
class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] hashTarget = new int[26], hashS = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hashS[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < target.length(); i++) {
            hashTarget[target.charAt(i) - 'a']++;
        }

        int ans = s.length();
        for (int i = 0; i < 26; i++) {
            if (hashTarget[i] == 0) {
                continue;
            }
            ans = Math.min(ans, hashS[i] / hashTarget[i]);
        }

        return ans;
    }
}