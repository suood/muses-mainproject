package com.muses.util;

import java.util.UUID;

/**
 * Created by mysgq1 on 15/6/7.
 */
public class UUIDTools {

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
}
