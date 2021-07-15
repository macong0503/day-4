package com.hqyj.mc.Text;

public class ArrayPrint_1 {
    public static void arr(int[] arr){
        //排序
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            sum+=arr[k];
        }
        System.out.println(sum);

    }
}
