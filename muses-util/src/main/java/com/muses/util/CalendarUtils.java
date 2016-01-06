package com.muses.util;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * 操作日期的类
 * Created by Alexander on 15/11/27.
 */
public class CalendarUtils {
    /**
     * 获取指定时间的几天数后的日期
     *
     * @param date 时间
     * @param days 延后天数 必须大雨等于零
     * @return <code>java.util.Date</code>
     */
    public static Date getDateAfterDays(Date date, int days) {
        days = days < 0 ? 0 : days;
        if (date == null) {
            date = new Date();
        }
        return DateUtils.addDays(date, days);
    }

    /**
     * 获取指定时间的固定天数前的日期
     *
     * @param date 时间
     * @param days 前置天数 必须大雨等于零
     * @return <code>java.util.Date</code>
     */
    public static Date getDateBeforeDays(Date date, int days) {
        days = days < 0 ? 0 : days;
        if (date == null) {
            date = new Date();
        }
        return DateUtils.addDays(date, 0 - days);
    }

    /**
     * 获取指定时间的固定分钟数后的日期
     *
     * @param date    时间
     * @param minutes 后置时间 必须大雨等于零
     * @return <code>java.util.Date</code>
     */
    public static Date getDateAfterMinutes(Date date, int minutes) {
        minutes = minutes < 0 ? 0 : minutes;
        if (date == null) {
            date = new Date();
        }
        return DateUtils.addMinutes(date, minutes);
    }

    /**
     * 获取指定时间的固定分钟数前的日期
     *
     * @param date    时间
     * @param minutes 前置时间 必须大雨等于零
     * @return <code>java.util.Date</code>
     */
    public static Date getDateBeforeMinutes(Date date, int minutes) {
        minutes = minutes < 0 ? 0 : minutes;
        if (date == null) {
            date = new Date();
        }
        return DateUtils.addMinutes(date, 0 - minutes);
    }

    /**
     * 判断两个日期是否同一天
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameDay(Date date1, Date date2) {
        return DateUtils.isSameDay(date1, date2);
    }
}
