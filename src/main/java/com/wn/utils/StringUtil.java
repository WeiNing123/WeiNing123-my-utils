package com.wn.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串处理工具类
 * @author WeiNing
 * @since 2021-10-28
 */

public class StringUtil {

    public static String bubbleTitle(String label){
        String result = "";
        int len = label.length();
        if(len <= 4){
            result = label;
        } else {
            int c = len / 3;
            List<String> str = new ArrayList<>();
            for(int i = 0; i<c; i++){
                str.add(label.substring(0, 3));
                label = label.substring(3);
            }
            if(label.length() > 0) str.add(label);
            for(String s : str) result += "\n" + s;
            result = result.substring(1);
        }
        return result;
    }
}
