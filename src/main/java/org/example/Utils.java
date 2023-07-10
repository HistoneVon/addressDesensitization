package org.example;

import cn.hutool.core.util.StrUtil;

/**
 * @author Histone Von fengclchn@outlook.com
 * @createdBy Histone Von
 * @date 2023/7/9 14:15
 */

public class Utils {
    /**
     * 返回子串在母串中最后一个字符的索引
     * @param str 母串
     * @param subStr 子串
     * @return int 子串最后一个字符的索引，错误返回-2，未找到返回-1
     */
    public static int strStr(String str, String subStr) {
        int index = -2;
        if (!StrUtil.isBlank(str) && !StrUtil.isBlank(subStr)) {
            index = str.indexOf(subStr);
            if (index != -1) {
                index += subStr.length() - 1;
            }
        }
        return index;
    }
}
