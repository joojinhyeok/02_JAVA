package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.JUNE, 18, 14, 25, 0);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        String[] days = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String dayStr = days[calendar.get(Calendar.DAY_OF_WEEK)];
        String amPm = hour < 12 ? "오전" : "오후";
        int hour12 = hour % 12 == 0 ? 12 : hour % 12;

        System.out.printf("%d년 %d월 %d일 %s %s %d시 %d분 %d초\n",
                year, month, day, dayStr, amPm, hour12, minute, second);
    }
}