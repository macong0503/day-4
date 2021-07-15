package com.hqyj.mc.Text;

public class ArrayText {
    public static void main(String[] args) {
        //数组的定义
        int[] arr01;
        int arr011[];
        double[] arr02;
        //如果需要使用数组，必须初始化
        /*
        * 初始化
        * 1、动态初始化
        *    格式：数据类型[] 数组名 =  new 数组类型[长度]
        *       数据类型前后要一样
        * 2、静态初始化
        *     格式1：数据类型[] 数组名 = new 数据类型[]{值}
        *     格式2：数据类型[] 数组名 = {}
        *  */

        int[] array = new int[2];
        System.out.println(array);//[I@1b6d3586 存储地址
        double[] array01 = new double[2];
        System.out.println(array01);
        //[D@4554617c [和@符号中间的字符表示当前数组的类型
        int[] array02 = new int[]{1,2,3,4};
        System.out.println(array02);
        int[] array03 = {};
        System.out.println(array03);

    }
}
