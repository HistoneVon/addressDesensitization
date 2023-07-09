# addressDesensitization

* 将中华人民共和国的地址脱敏到第二级（不一定是地区级）
* 中华人民共和国的地区级行政区划分为四种：地级市、地区、盟、自治州
* 地址脱敏思路如下
  * 找到【盟】
  * 找到【自治州】
  * 找到【地区】
  * 找到【市】
    * 如果是【地级市】即可结束
    * 如果是【直辖市】则找到下一级的【区】或【县】
  * 如果均不符合则脱敏2/3的地址（包括英文）

* 示例

```java
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
```

![image-20230709180333322](https://histone-obs.obs.cn-southwest-2.myhuaweicloud.com/noteImg/image-20230709180333322.png)