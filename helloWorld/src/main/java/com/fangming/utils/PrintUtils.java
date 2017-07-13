package com.fangming.utils;

/**
 * Created by Jack on 2017/7/13.
 */
public class PrintUtils {

    public static String toString(String [] strings){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i= 0; i < strings.length ; i++) {
            sb.append(strings[i]);
            if (i < strings.length - 1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
