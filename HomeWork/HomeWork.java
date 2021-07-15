package com.hqyj.mc.Text.HomeWork;
		//需求：在编程竞赛中，有6个评委为参赛选手打分，分数为0-100的整数分
        //规则：去掉一个最高分，去掉一个最低分，剩余分数的平均值就是选手分数
public class HomeWork {
    public static void Fen(int[] a){
        //排序
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //去掉最高分和最低分
        a[0]=0;
        a[5]=0;
        //求平均值
        int sum = 0;
        double fenshu = 0;
        for (int k = 0; k < a.length; k++) {
            sum=sum+a[k];
            fenshu=sum/4.0;
        }
        System.out.println("最终分数："+fenshu);
    }
}
