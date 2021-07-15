package com.hqyj.mc.Text;

public class ArrayText_2 {
    public static void main(String[] args) {
        /*
        * 如何访问数组 使用索引
        *
        * 索引：从0开始，依次增1
        * */
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[2]);//0
        System.out.println("-----------");
        double[] array = {1,2,3,4,5};
        System.out.println(array[4]);//5.0


        int[] a={1,2,5,15,5,55,8,5,8,5,5};
        System.out.println(a.length);
        //遍历
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int j = a.length-1; j >=0; j--) {
            System.out.print(a[j] + " ");
        }
        System.out.println();

        int[] arr01 = {1,2,3};
        int[] arr02 = arr01;
        arr02[0]=2;//{2,2,3}
        System.out.println(arr01[0]);

        arr01=null;
        //System.out.println(arr01[0]);//NullPointerException
        System.out.println(arr02[0]);

    }
}
