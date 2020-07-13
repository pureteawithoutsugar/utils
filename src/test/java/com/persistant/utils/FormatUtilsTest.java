/**
 * Created by IntelliJ IDEA.
 * User: persistant
 * Date: 2020-07-09
 */
package com.persistant.utils;

import com.persistant.utils.date.FormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FormatUtilsTest {

    @Test
    public void formatDateToString() {
        Date date = new Date();
        String formatDate = FormatUtils.formatDate(date);
        System.out.println(formatDate);
    }

    @Test
    public void formatHours() {
        Date date = new Date();
        String formatHours = FormatUtils.formatHours(date);
        System.out.println(formatHours);
    }

    @Test
    public void formatStringToDate() {
        String date = "2020-07-09";
        Date formatDate = FormatUtils.formatDate(date);
        System.out.println(formatDate);
    }

    @Test
    public void formatStringToDateTime() {
        String dateTime = "2020-07-09 14:00:00";
        Date formatDateTime = FormatUtils.formatDateTime(dateTime);
        System.out.println(formatDateTime);
    }

    @Test
    public void formatDateTimeString() {
        String dateTime = "2020-07-09 14:00:00";
        String formatDateTimeString = FormatUtils.formatDateTimeString(dateTime);
        System.out.println(formatDateTimeString);

    }

    @Test
    public void formatDateCoach() {
        String dateTime = "2020/07/09 14:00:00";
        Date formatDateCoach = FormatUtils.formatDateCoach(dateTime);
        System.out.println(formatDateCoach);
    }

    @Test
    public void getYearStartDay() {
        Date yearStartDay = FormatUtils.getYearStartDay();
        System.out.println(yearStartDay);
    }

    @Test
    public void getMonthStartDay() {
        Date monthStartDay = FormatUtils.getMonthStartDay();
        System.out.println(monthStartDay);
    }

    @Test
    public void getMonthEndDay() {
        Date monthEndDay = FormatUtils.getMonthEndDay();
        System.out.println(monthEndDay);
    }

    @Test
    public void getWeekStartDay() {
        Date weekStartDay = FormatUtils.getWeekStartDay();
        System.out.println(weekStartDay);
    }

    @Test
    public void getMinutes() {
        int minutes = FormatUtils.getMinutes();
        System.out.println(minutes);
    }

    @Test
    public void getStartTime() {
        Date startTime = FormatUtils.getStartTime(1);
        System.out.println(startTime);
    }

    @Test
    public void getCurrentActualMaximum() {
        int currentActualMaximum = FormatUtils.getCurrentActualMaximum();
        System.out.println(currentActualMaximum);
    }

    @Test
    public void getDaysFromWeek() {
        String daysFromWeek = FormatUtils.getDaysFromWeek(2020, 1);
        System.out.println(daysFromWeek);
    }
}
