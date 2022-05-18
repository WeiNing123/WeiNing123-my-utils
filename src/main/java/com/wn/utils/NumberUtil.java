package com.wn.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 数字处理工具类
 * @author WeiNing
 * @since 2021-10-28
 */

public class NumberUtil {

    /**
     * 整除
     * @param divisor 除数
     * @param dividend 被除数
     * @return
     */
    public static int except (int divisor, int dividend) {
        return dividend / divisor;
    }

    /**
     * 求余
     * @param divisor 除数
     * @param dividend 被除数
     * @return
     */
    public static int surplus (int divisor, int dividend) {
        return dividend % divisor;
    }

    /**
     * 两数相除，四舍五入保留一位小数
     * @param divisor 除数
     * @param dividend 被除数
     * @return
     */
    public static String decimal1(int divisor, int dividend) {
        DecimalFormat format = new DecimalFormat("0.0");
        return format.format((float) dividend / (float) divisor);
    }

    /**
     * 两数相除，四舍五入保留两位小数
     * @param divisor 除数
     * @param dividend 被除数
     * @return
     */
    public static String decimal2(int divisor, int dividend) {
        DecimalFormat format = new DecimalFormat("0.00");
        return format.format((float) dividend / (float) divisor);
    }

    /**
     * 求百分比保留一位小数
     * @param divisor 除数
     * @param dividend 被除数
     * @return
     */
    public static String percentage1(int divisor, int dividend) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(1);
        return numberFormat.format((float) dividend / (float) divisor * 100);
    }

    /**
     * 求百分比保留两位小数
     * @param divisor 除数
     * @param dividend 被除数
     * @return
     */
    public static String percentage2(int divisor, int dividend) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        return numberFormat.format((float) dividend / (float) divisor * 100);
    }

    /**
     * 获取页数
     * @param total 数据量
     * @param size 每页条数
     * @return
     */
    public static int pageNum (int total, int size) {
        int page = 0;
        if (total%size == 0) {
            page = total/size;
        } else {
            page = total/size + 1;
        }
        return page;
    }
}
