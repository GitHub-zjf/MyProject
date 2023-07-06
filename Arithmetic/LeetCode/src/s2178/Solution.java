package s2178;

import java.util.ArrayList;
import java.util.List;

/**
 * 2178. 拆分成最多数目的正偶数之和
 *
 *  想拆分成最多数目的正偶数数组且数组元素各不相同, 可以让数组中的元素尽可能小, 即按2、4、6、...这样以等差数列的形式排列, 如果最后没有刚好排完, 将剩余的数与等差数列的最后一项合并
 */
class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ret = new ArrayList<>();

        if (finalSum % 2 != 0) {
            return ret;
        }

        for (long i = 2; i <= finalSum; i += 2) {
            ret.add(i);
            finalSum -= i;
        }

        int last = ret.size() - 1;
        ret.set(last, ret.get(last) + finalSum);

        return ret;
    }
}