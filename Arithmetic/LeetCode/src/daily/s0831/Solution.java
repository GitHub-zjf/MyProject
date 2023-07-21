package daily.s0831;

/**
 *  831. ���ظ�����Ϣ
 */
class Solution {
    String[] country = {"", "+*-", "+**-", "+***-"};

    public String maskPII(String s) {
        int at = s.indexOf("@");
        if (at > 0) {
            s = s.toLowerCase();
            return s.charAt(0) + "*****" + s.substring(at - 1);
        }

        s = s.replaceAll("[^\\d]+", "");
        return country[s.length() - 10] + "***-***-" + s.substring(s.length() - 4);
    }

}