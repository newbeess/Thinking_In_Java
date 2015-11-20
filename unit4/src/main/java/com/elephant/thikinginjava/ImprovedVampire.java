package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/20.
 */
public class ImprovedVampire {
    public static void main(String[] args) {
        String[] ar_str1 = null, ar_str2=null;
                 int sum = 0;
                 int count=0,count1=0;
                 for (int i = 10; i < 100; i++) {
                         for (int j = i ; j < 100; j++) {
                             int i_val = i * j;
                             // 积小于1000或大于9999排除,继续下一轮环
                             if (i_val < 1000 || i_val > 9999) {
                                 count1++;
                                 continue;
                             }
                             count++;
                             //将积划分成单个字符，存放在数组中
                                 ar_str1 = String.valueOf(i_val).split("");
                             //将两个字符连接后，划分成单个字符，存放在数组中
                                 ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                             //将两个字符数组按照升序的顺序排序
                                 java.util.Arrays.sort(ar_str1);
                                 java.util.Arrays.sort(ar_str2);
                             // 排序后比较,如果相等，则找到一个吸血鬼数字
                             if (java.util.Arrays.equals(ar_str1, ar_str2)) {
                                         sum++;
                                         System.out.println("第" + sum + "组: " + i + "*" + j + "=" + i_val);
                                     }
                             }
                    }
                 System.out.println("共找到" + sum + "个吸血鬼数。"+"\n实际计算次数："+count+"\n乘积小于1000或大于9999的个数为："+count1);

            }
}
