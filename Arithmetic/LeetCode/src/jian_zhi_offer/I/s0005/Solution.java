package jian_zhi_offer.I.s0005;

/**
 * ��ָ Offer 05. �滻�ո�
 */
class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}