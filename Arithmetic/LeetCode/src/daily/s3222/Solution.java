package daily.s3222;

/**
 * 3222. ���Ӳ����Ϸ��Ӯ��
 */
class Solution {
    public String losingPlayer(int x, int y) {
        boolean flag = true;
        while (true) {
            x -= 1;
            y -= 4;
            if (x < 0 || y < 0) {
                break;
            } else {
                flag = !flag;
            }
        }

        return flag ? "Bob" : "Alice";
    }
}