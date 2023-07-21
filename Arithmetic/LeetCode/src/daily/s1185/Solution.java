package daily.s1185;

/**
 *  1185. һ���еĵڼ���
 */
class Solution {

    public String dayOfTheWeek(int day, int month, int year) {
//        String[] WEEK = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        LocalDate localDate = LocalDate.of(year, month, day);
//        return WEEK[localDate.getDayOfWeek().ordinal()];
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        /* �������֮ǰ����ݵ��������� */
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        /* ��������У������·�֮ǰ���·ݵ��������� */
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        /* �����·��е��������� */
        days += day;
        return week[(days + 3) % 7];
    }
}