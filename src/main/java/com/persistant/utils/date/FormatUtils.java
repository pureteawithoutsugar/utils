/**
 * Created by IntelliJ IDEA.
 * User: persistant
 * Date: 2020-07-09
 */
package com.persistant.utils.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FormatUtils {


    /*将日期转化为字符串,返回结果为"2020-07-09"*/
    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    /*获取当前时间，返回结果为整点字符串*/
    public static String formatHours(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        return simpleDateFormat.format(date);
    }

    /*将字符串转化为标准日期，返回结果为Date*/
    public static Date formatDate(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("转化失败，格式不正确");
            return null;
        }
    }

    /*将字符串转化为标准日期，返回结果为Date*/
    public static Date formatDateTime(String dateTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(dateTime);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("转化失败，格式不正确");
            return null;
        }
    }

    /*将字符串转化为标准日期的字符串，返回结果为String*/
    public static String formatDateTimeString(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(date).toString();
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /*将带"/"日期字符串转化为标准日期，返回结果为Date*/
    public static Date formatDateCoach(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("转化失败，格式不正确");
            return null;
        }
    }

    /**
     * 获取日期格式如20200709140000
     */
    public static String formatToString(Date date) {
        //获取默认选中的日期的年月日星期的值，并赋值
        Calendar calendar = Calendar.getInstance();//日历对象
        calendar.setTime(date);//设置当前日期

        String yearStr = calendar.get(Calendar.YEAR) + "";//获取年份
        int month = calendar.get(Calendar.MONTH) + 1;//获取月份
        String monthStr = month < 10 ? "0" + month : month + "";
        int day = calendar.get(Calendar.DATE);//获取日
        String dayStr = day < 10 ? "0" + day : day + "";
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        String hourStr = hour < 10 ? "0" + hour : hour + "";
        int minute = calendar.get(Calendar.MINUTE);
        String minuteStr = minute < 10 ? "0" + minute : minute + "";
        int second = calendar.get(Calendar.SECOND);
        String secondStr = second < 10 ? "0" + second : second + "";
        String time = yearStr + monthStr + dayStr + hourStr + minuteStr + secondStr;

        return time;
    }

    /*获取本年第一天*/
    public static Date getYearStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        return date;
    }

    /*获取本月第一天*/
    public static Date getMonthStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        return date;
    }

    /*获取本月最后一天*/
    public static Date getMonthEndDay() {
        Calendar calendar = Calendar.getInstance();
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        Date date = calendar.getTime();
        return date;
    }

    /*获取本周第一天*/
    public static Date getWeekStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        return date;
    }

    /*获取今天经过的分钟数*/
    public static int getMinutes() {
        Calendar calendar = Calendar.getInstance();
        //经过的小时数
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        return hour * 60 + calendar.get(Calendar.MINUTE);
    }

    /*获取某天开始时间，入参为0则为今天*/
    public static Date getStartTime(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, day);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /*获取指定日期某天开始时间*/
    public static Date getStartTime(Date date, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, day);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /*获取某天结束时间，入参为0则为今天*/
    public static Date getEndTime(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, day);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    /*获取当月天数*/
    public static int getCurrentActualMaximum() {
        return Calendar.getInstance().getActualMaximum(Calendar.DATE);
    }

    /*获取某月天数*/
    public static int getActualMaximum(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DATE);
    }

    /*获取当前号数*/
    public static int getDay() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /*两个时间相差的天数*/
    public static int DateSubtraction(Date date1, Date date2) {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
        return days;
    }

    /*两个时间相差的分钟数*/
    public static int DateSubtractionMi(Date date1, Date date2) {
        int mins = (int) ((date2.getTime() - date1.getTime()) / (1000 * 60));
        return mins;
    }

    /*某个时间距离现在的小时数*/
    public static long getDistenceHours(Date time) {
        return (new Date().getTime() - time.getTime()) / (60 * 1000);
    }


    //获取某年的第几周的开始日期
    public static Date getFirstDayOfWeek(int year, int week) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 1);

        Calendar cal = (GregorianCalendar) calendar.clone();
        cal.add(Calendar.DATE, week * 7);

        return getFirstDayOfWeek(cal.getTime());
    }

    // 获取某年的第几周的结束日期
    public static Date getLastDayOfWeek(int year, int week) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DATE, 1);

        Calendar cal = (GregorianCalendar) calendar.clone();
        cal.add(Calendar.DATE, week * 7);

        return getLastDayOfWeek(cal.getTime());
    }

    //获取当前时间所在周的开始日期
    public static Date getFirstDayOfWeek(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek()); // Monday
        return calendar.getTime();
    }

    //获取当前时间所在周的结束日期
    public static Date getLastDayOfWeek(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek() + 6); // Sunday
        return calendar.getTime();
    }

    /*获取某年第某周的起始日期，如2020年的第一周为"2020-01-06~2020-01-12"*/
    public static String getDaysFromWeek(int year, int week) {
        return "" + formatDate(getFirstDayOfWeek(year, week)) + "~" + formatDate(getLastDayOfWeek(year, week));

    }

    /*获取过去第几天的日期(- 操作) 或者 未来 第几天的日期( + 操作)*/
    public static Date getPastDate(int past, Date time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);
        Date today = calendar.getTime();
        return today;
    }
}
