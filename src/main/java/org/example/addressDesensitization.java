package org.example;

import cn.hutool.core.util.StrUtil;

/**
 * @author Histone Von fengclchn@outlook.com
 * @createdBy Histone Von
 * @date 2023/7/9 14:28
 */

public class addressDesensitization {
    public static String desensitize(String address) {
        String addressDesensitized;
        if (utils.strStr(address, "盟") >= 0) { // 1.盟
            addressDesensitized = StrUtil.hide(address, utils.strStr(address, "盟") + 1, address.length());
        } else if (utils.strStr(address, "自治州") >= 0) { // 2.自治州
            addressDesensitized = StrUtil.hide(address, utils.strStr(address, "自治州") + 1, address.length());
        } else if (utils.strStr(address, "地区") >= 0) { // 3.地区
            addressDesensitized = StrUtil.hide(address, utils.strStr(address, "地区") + 1, address.length());
        } else if (utils.strStr(address, "市") >= 0) { // 4.市
            boolean isBeijing = address.contains("北京"); // 4-1.排除直辖市
            boolean isShanghai = address.contains("上海");
            boolean isTianjin = address.contains("天津");
            boolean isChongqing = address.contains("重庆");
            if (!isBeijing && !isShanghai && !isTianjin && !isChongqing) { // 4-2.地级市
                addressDesensitized = StrUtil.hide(address, utils.strStr(address, "市") + 1, address.length());
            } else { // 4-3.直辖市查区县
                int indexDistrictOrCounty; // 直辖市的区或者县
                if (utils.strStr(address, "区") >= 0) {
                    indexDistrictOrCounty = utils.strStr(address, "区");
                } else if (utils.strStr(address, "县") >= 0) {
                    indexDistrictOrCounty = utils.strStr(address, "县");
                } else {
                    indexDistrictOrCounty = 3; // 从下标3的字符开始脱敏，直辖市都是三个字的
                }
                addressDesensitized = StrUtil.hide(address, indexDistrictOrCounty + 1, address.length());
            }
        } else { // 5.其余的脱敏2/3
            addressDesensitized = StrUtil.hide(address, address.length() / 3, address.length());
        }
        return addressDesensitized;
    }
}
