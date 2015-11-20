package com.elephant.thikinginjava;

/**
 * Created by elephant on 15/11/20.
 */
public class OfficalVampire {
    public static void main(String[] args){
        int[] startDigit = new int[4];
        int[] productDigit = new int[4];
        int count1=0,count2=0;
        for(int num1 = 10; num1 <= 99; num1++)
            for(int num2 = num1; num2 <= 99; num2++) {
                // Pete Hartley's theoretical result:
                // If x·y is a vampire number then
                // x·y == x+y (mod 9)
                if((num1 * num2) % 9 != (num1 + num2) % 9){
                    count1++;
                    continue;

                }
                 count2++;
                 int product = num1 * num2;
                 startDigit[0] = num1 / 10;
                 startDigit[1] = num1 % 10;
                 startDigit[2] = num2 / 10;
                 startDigit[3] = num2 % 10;
                 productDigit[0] = product / 1000;
                 productDigit[1] = (product % 1000) / 100;
                 productDigit[2] = product % 1000 % 100 / 10;
                 productDigit[3] = product % 1000 % 100 % 10;
                 int count = 0;
                 for(int x = 0; x < 4; x++)
                       for(int y = 0; y < 4; y++) {
                           if (productDigit[x] == startDigit[y]) {
                               count++;
                               productDigit[x] = -1;
                               startDigit[y] = -2;//这两步赋值是最棒的，放置出现
                           }
                       }
                if(count == 4)
                    System.out.println(num1 + " * " + num2 + " : " + product);
            }
        System.out.println("被If条件挡住的次数为："+count1+"\n实际计算次数为："+count2);
    }
}
