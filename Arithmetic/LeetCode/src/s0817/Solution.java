package s0817;

import java.util.HashSet;
import java.util.Set;

/**
 * 817. Á´±í×é¼ş
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ret = 0;
        boolean inSet = false;
        while (head != null) {
            int val = head.val;
            if (set.contains(val)) {
                if (!inSet) {
                    inSet = true;
                    ret++;
                }
            } else {
                inSet = false;
            }
            head = head.next;
        }
        return ret;
    }
}