package com.muses.logger;

import org.apache.logging.log4j.Level;

/**
 * Created by Alexander on 15/11/18.
 */
public class CustomerLevel {
//    Standard Level	intLevel
//    OFF	0
//    FATAL	100
//    ERROR	200
//    WARN	300
//    INFO	400
//    DEBUG	500
//    TRACE	600
//    ALL	Integer.MAX_VALUE

//    <CustomLevel name="DIAG" intLevel="10" />
//    <CustomLevel name="NOTICE" intLevel="20" />
//    <CustomLevel name="MESSAGE" intLevel="30" />
//    <CustomLevel name="SLOW_QUERY" intLevel="30" />

    public static final Level PAYMENT = Level.forName("PAYMENT", 5);//支付询级别日志
    public static final Level NOTICE = Level.forName("NOTICE", 10);//通知询级别日志
    public static final Level MESSAGE = Level.forName("MESSAGE", 15);//消息询级别日志
    public static final Level SLOW_QUERY = Level.forName("SLOW_QUERY", 20);//慢查询级别日志
    public static final Level ANALYSIS = Level.forName("ANALYSIS", 25);//数据分析级别日志




}
