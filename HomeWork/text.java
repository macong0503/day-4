package com.hqyj.mc.Text.HomeWork;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        int[] array = new int[6];
        System.out.println("请评委打分：");
        for (int i = 0; i < 6 ; i++) {
            Scanner sc = new Scanner(System.in);
            array[i]=sc.nextInt();
        }
        HomeWork.Fen(array);

    }
}
