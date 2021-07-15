package com.hqyj.mc.Text;

public class ArrayPrint {
    public static void printArray(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
    }
}
