package daily.s2682;

import java.util.ArrayList;
import java.util.List;

/**
 * 2682. �ҳ�תȦ��Ϸ���
 */
class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] count = new int[n];
        // �������
        int i = 1;
        // ��ǵ�ǰ������
        int j = 0;
        while (true) {
            count[j] = count[j] + 1;
            if (count[j] > 1) {
                break;
            }
            j = (j + i * k) % n;
            i++;
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x < count.length; x++) {
            if (count[x] == 0) {
                list.add(x + 1);
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        int[] s = new Solution().circularGameLosers(4, 4);
        for (int i : s) {
            System.out.println(i);
        }
    }
}