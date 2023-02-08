package s1233;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  1233. É¾³ı×ÓÎÄ¼ş¼Ğ
 */
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            int pre = ans.get(ans.size() - 1).length();
            if (!(pre < folder[i].length() && ans.get(ans.size() - 1).equals(folder[i].substring(0, pre)) && folder[i].charAt(pre) == '/')) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}