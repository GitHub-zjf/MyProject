package daily.s1592;

/**
 * 1592. �������е��ʼ�Ŀո�
 */
class Solution {
    public String reorderSpaces(String text) {
        // ���ʵ���Ŀ
        String[] word = text.trim().split(" {1,}");
        int wordNum = word.length;
        // �ո������
        int spaceNum = text.length() - text.replace(" ", "").length();
        // ����ո������
        int s;
        if (wordNum > 1) {
            s = spaceNum / (wordNum - 1);
        } else {
            s = spaceNum;
        }
        String space = "";
        for (int i = 0; i < s; i++) {
            space += " ";
        }
        String ans = "";
        for (int i = 0; i < wordNum; i++) {
            ans += word[i];
            if (i != wordNum - 1) {
                ans += space;
                spaceNum = spaceNum - s;
            }
        }
        for (int i = 0; i < spaceNum; i++) {
            ans += " ";
        }

        return ans;
    }

    public static void main(String[] args) {
        String text = " a ";
        System.out.println(new Solution().reorderSpaces(text));
    }
}