package com.hqyj.mc.Text;

public class Text_1 {
   //阶乘
    public static int Jiecheng(int i){
        if (i==1){
            return 1;
        }
        return i * Jiecheng(i-1);
    }
    //斐波那契
    public static int Fbnq(int i){
        if (i==1)
            return 1;
        if (i==2)
            return 1;
        return Fbnq(i-1)+Fbnq(i-2);
    }
    //1~100的和
    public static int getSum(int i){
        if (i==1){
            return 1;
        }
        return i + getSum(--i);
    }


    public static void main(String[] args) {
//        int sum = 0;
//        for (int j = 1; j < 11 ; j++) {
//            Jiecheng(j);
//            sum=sum+Jiecheng(j);
//        }
//        System.out.println(sum);
//
//        ///////
//        for (int k = 1; k < 11; k++) {
//            Fbnq(k);
//            System.out.print(Fbnq(k) + " ");
//        }
//        System.out.println();
//        //////////
//        System.out.println(getSum(100));

    }
}
