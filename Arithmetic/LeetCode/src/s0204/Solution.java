package s0204;

import java.util.Arrays;

/**
 * ͳ������С�ڷǸ����� n ��������������
 *
 * @author zheng
 */
class Solution {
    // ʱ�䳬��
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrime(i);
        }
        return count;
    }

    public int isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    /**
     * ��ɸ��
     *
     * @param n
     * @return
     */
    public int countPrimes2(int n) {
        // ��ȫ�����Ϊtrue
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);

        // ��2��ʼ���ж��������������ô����Ӧ���������־ͱ��Ϊ����
        for (int i = 2; i * i < n; i++) {
            if (isPrimes[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrimes[j] = false;
                }
            }
        }

        // ͳ��
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes2(50000));
    }
}