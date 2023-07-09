package org.example;

/**
 * @author Histone Von fengclchn@outlook.com
 * @createdBy Histone Von
 * @date 2023/7/9 14:05
 */

public class App {
    public static void main(String[] args) {
        System.out.println(addressDesensitization.desensitize("浙江省宁波市江北区同济路280弄155号"));
        System.out.println(addressDesensitization.desensitize("内蒙古自治区锡林郭勒盟二连浩特市格日勒敖都苏木"));
        System.out.println(addressDesensitization.desensitize("吉林省延边朝鲜族自治州延吉市依兰镇"));
        System.out.println(addressDesensitization.desensitize("新疆维吾尔自治区阿勒泰地区阿勒泰市解放路街道"));
        System.out.println(addressDesensitization.desensitize("北京市海淀区中关村街道"));
        System.out.println(addressDesensitization.desensitize("上海市浦东新区陆家嘴街道"));
        System.out.println(addressDesensitization.desensitize("重庆市酉阳土家族苗族自治县中和街道"));
        System.out.println(addressDesensitization.desensitize("香港特别行政区湾仔区铜锣湾"));
        System.out.println(addressDesensitization.desensitize("No. 7, Section 5, Xinyi Road, Xinyi District, Taipei"));
    }
}