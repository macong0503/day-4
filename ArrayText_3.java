package com.hqyj.mc.Text;

public class ArrayText_3 {
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        array[0]=666;
        array=null;
    }
}
