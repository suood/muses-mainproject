package com.muses.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Alexander on 15/11/27.
 */
public final class LoggerUtil {

    private static Logger getClassLogger(){
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stacktrace[3];
        String name = element.getClassName();
        return  LogManager.getLogger(name);
    }

    public  static void paymentLog(String message){
        getClassLogger().log(CustomerLevel.PAYMENT,message);
    }

    public  static void analysisLog(String message){
        getClassLogger().log(CustomerLevel.ANALYSIS,message);
    }
    public  static void messageLog(String message){
        getClassLogger().log(CustomerLevel.MESSAGE,message);
    }
    public  static void slowQueryLog(String message){
        getClassLogger().log(CustomerLevel.SLOW_QUERY,message);
    }
    public  static void noticeLog(String message){
        getClassLogger().log(CustomerLevel.NOTICE,message);
    }
}
