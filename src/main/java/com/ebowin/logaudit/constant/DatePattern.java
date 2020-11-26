package com.ebowin.logaudit.constant;

import org.apache.commons.lang3.time.FastDateFormat;

public class DatePattern {

    public static final String NORM_DATE_PATTERN = "yyyy-MM-dd";
    public static final FastDateFormat NORM_DATE_FORMAT = FastDateFormat.getInstance(NORM_DATE_PATTERN);

    public static final String PURE_DATE_PATTERN = "yyyyMMdd";
    public static final FastDateFormat PURE_DATE_FORMAT = FastDateFormat.getInstance(PURE_DATE_PATTERN);

    public static final String NORM_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final FastDateFormat NORM_DATETIME_FORMAT = FastDateFormat.getInstance(NORM_DATETIME_PATTERN);

    public static final String NORM_DATETIME_MS_PATTERN = "yyyy-MM-dd HH:mm:ss,SSS";
    public static final FastDateFormat NORM_DATETIME_MS_FORMAT = FastDateFormat.getInstance(NORM_DATETIME_MS_PATTERN);

    public static final String NORM_DATETIME_MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
    public static final FastDateFormat NORM_DATETIME_MINUTE_FORMAT = FastDateFormat.getInstance(NORM_DATETIME_MINUTE_PATTERN);

    public static final String PURE_DATETIME_PATTERN = "yyyyMMddHHmmss";
    public static final FastDateFormat PURE_DATETIME_FORMAT = FastDateFormat.getInstance(PURE_DATETIME_PATTERN);
    public static final String PURE_DATETIME_MS_PATTERN = "yyyyMMddHHmmssSSS";
    public static final FastDateFormat PURE_DATETIME_MS_FORMAT = FastDateFormat.getInstance(PURE_DATETIME_MS_PATTERN);

    public static final String EN_DATE_PATTERN = "yyyy/MM/dd";
    public static final FastDateFormat EN_DATE_FORMAT = FastDateFormat.getInstance(EN_DATE_PATTERN);
    public static final String EN_DATE_MONTH_PATTERN = "yyyy/MM";
    public static final FastDateFormat EN_DATE_MONTH_FORMAT = FastDateFormat.getInstance(EN_DATE_MONTH_PATTERN);
    public static final String EN_DATETIME_MINUTE_PATTERN = "yyyy/MM/dd HH:mm";
    public static final FastDateFormat EN_DATETIME_MINUTE_FORMAT = FastDateFormat.getInstance(EN_DATETIME_MINUTE_PATTERN);
    public static final String EN_DATETIME_PATTERN = "yyyy/MM/dd HH:mm:ss";
    public static final FastDateFormat EN_DATETIME_FORMAT = FastDateFormat.getInstance(EN_DATETIME_PATTERN);

    public static final String CN_DATE_PATTERN = "yyyy年MM月dd日";
    public static final FastDateFormat CN_DATE_FORMAT = FastDateFormat.getInstance(CN_DATE_PATTERN);
    public static final String CN_DATE_MONTH_PATTERN = "yyyy年MM月";
    public static final FastDateFormat CN_DATE_MONTH_FORMAT = FastDateFormat.getInstance(CN_DATE_MONTH_PATTERN);
    public static final String CN_DATETIME_MINUTE_PATTERN = "yyyy年MM月dd日 HH:mm";
    public static final FastDateFormat CN_DATETIME_MINUTE_FORMAT = FastDateFormat.getInstance(CN_DATETIME_MINUTE_PATTERN);
    public static final String CN_DATETIME_PATTERN = "yyyy年MM月dd日 HH:mm:ss";
    public static final FastDateFormat CN_DATETIME_FORMAT = FastDateFormat.getInstance(CN_DATETIME_PATTERN);

    public static final String SIMPLE_DATE_MONTH_PATTERN = "yyyy-MM";
    public static final FastDateFormat SIMPLE_DATE_MONTH_FORMAT = FastDateFormat.getInstance(SIMPLE_DATE_MONTH_PATTERN);
    public static final String SIMPLE_DATE_DAY_PATTERN = "MM-dd";
    public static final FastDateFormat SIMPLE_DATE_DAY_FORMAT = FastDateFormat.getInstance(SIMPLE_DATE_DAY_PATTERN);
    public static final String SIMPLE_DATETIME_MINUTE_PATTERN = "MM-dd HH:mm";
    public static final FastDateFormat SIMPLE_DATETIME_MINUTE_FORMAT = FastDateFormat.getInstance(SIMPLE_DATETIME_MINUTE_PATTERN);
    public static final String SIMPLE_DATETIME_SECOND_PATTERN = "MM-dd HH:mm:ss";
    public static final FastDateFormat SIMPLE_DATETIME_SECOND_FORMAT = FastDateFormat.getInstance(SIMPLE_DATETIME_SECOND_PATTERN);
    public static final String SIMPLE_TIME_MINUTE_PATTERN = "HH:mm";
    public static final FastDateFormat SIMPLE_TIME_MINUTE_FORMAT = FastDateFormat.getInstance(SIMPLE_TIME_MINUTE_PATTERN);

    public static final String NORM_TIME_PATTERN = "HH:mm:ss";
    public static final FastDateFormat NORM_TIME_FORMAT = FastDateFormat.getInstance(NORM_TIME_PATTERN);
    public static final String PURE_TIME_PATTERN = "HHmmss";
    public static final FastDateFormat PURE_TIME_FORMAT = FastDateFormat.getInstance(PURE_TIME_PATTERN);

    public static final String EN_SIMPLE_DATE_DAY_PATTERN = "MM/dd";
    public static final FastDateFormat EN_SIMPLE_DATE_DAY_FORMAT = FastDateFormat.getInstance(EN_SIMPLE_DATE_DAY_PATTERN);
    public static final String EN_SIMPLE_DATETIME_MINUTE_PATTERN = "MM/dd HH:mm";
    public static final FastDateFormat EN_SIMPLE_DATETIME_MINUTE_FORMAT = FastDateFormat.getInstance(EN_SIMPLE_DATETIME_MINUTE_PATTERN);
    public static final String EN_SIMPLE_DATETIME_SECOND_PATTERN = "MM/dd HH:mm:ss";
    public static final FastDateFormat EN_SIMPLE_DATETIME_SECOND_FORMAT = FastDateFormat.getInstance(EN_SIMPLE_DATETIME_SECOND_PATTERN);

    public static final String CN_SIMPLE_DATE_DAY_PATTERN = "MM月dd日";
    public static final FastDateFormat CN_SIMPLE_DATE_DAY_FORMAT = FastDateFormat.getInstance(CN_SIMPLE_DATE_DAY_PATTERN);
    public static final String CN_SIMPLE_DATETIME_MINUTE_PATTERN = "MM月dd日 HH:mm";
    public static final FastDateFormat CN_SIMPLE_DATETIME_MINUTE_FORMAT = FastDateFormat.getInstance(CN_SIMPLE_DATETIME_MINUTE_PATTERN);
    public static final String CN_SIMPLE_DATETIME_SECOND_PATTERN = "MM月dd日 HH:mm:ss";
    public static final FastDateFormat CN_SIMPLE_DATETIME_SECOND_FORMAT = FastDateFormat.getInstance(CN_SIMPLE_DATETIME_SECOND_PATTERN);

    public static final String SPECIAL_SIMPLE_DATE_PATTERN = "yyyy.MM.dd";
    public static final FastDateFormat SPECIAL_SIMPLE_DATE_FORMAT = FastDateFormat.getInstance(SPECIAL_SIMPLE_DATE_PATTERN);
    public static final String SPECIAL_SIMPLE_DATE_DAY_PATTERN = "MM.dd";
    public static final FastDateFormat SPECIAL_SIMPLE_DATE_DAY_FORMAT = FastDateFormat.getInstance(SPECIAL_SIMPLE_DATE_DAY_PATTERN);

}