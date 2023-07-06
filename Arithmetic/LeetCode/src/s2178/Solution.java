package s2178;

import java.util.ArrayList;
import java.util.List;

/**
 * 2178. ��ֳ������Ŀ����ż��֮��
 *
 *  ���ֳ������Ŀ����ż������������Ԫ�ظ�����ͬ, �����������е�Ԫ�ؾ�����С, ����2��4��6��...�����ԵȲ����е���ʽ����, ������û�иպ�����, ��ʣ�������Ȳ����е����һ��ϲ�
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