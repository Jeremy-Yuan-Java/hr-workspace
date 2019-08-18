package com.hrbc.business.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 处理快捷日期的工具类
 * @author huangyongchao
 */
public class QuickTimeUtil {


    public static Date firstDate(int plusday) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,plusday);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date lastDate(int plusday) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,plusday);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    public static Date plusDay(int plusday) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,plusday);
        return calendar.getTime();
    }

    public static String dateParseString(Date date ,String pattern){
        if(date == null){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }


    public static Date firstDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date lastDate(Date date) {
        Calendar calendar =  Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }


    public static void main(String[] args) {
        System.out.println(QuickTimeUtil.firstDate(new Date()));
        System.out.println(QuickTimeUtil.lastDate(new Date()));
    }
}
