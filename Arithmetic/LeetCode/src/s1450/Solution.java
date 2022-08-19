package s1450;

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int len = startTime.length;
        int stuNum = 0;
        for (int i = 0; i < len; i++) {
            if(startTime[i] <= queryTime && queryTime <= endTime[i]){
                stuNum++;
            }
        }
        return stuNum;
    }
}