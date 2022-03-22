package com.atguigu.myssm.util;

/**
 * @author 胡金龙
 * @create 2022-03-21 21:48
 */
public class StringUtil {
    //判断字符串是否为null或者""
    public static boolean isEmpty(String str){
        return str==null || "".equals(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}