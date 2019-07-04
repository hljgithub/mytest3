package com.fortunes.sort;

import java.util.Arrays;

/**
 * Created by HuoLiJun on 2018/3/17 0017.
 */
public class BuddleSortDemo {
    public static void main(String[] args) {
        int[] b = new int[]{12,52,2,56};
        BuddleSortDemo.sort(b);
    }

    /**
     * 冒泡排序
     * @param a
     */
    public static void  sort(int[] a){
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

                if (a[j]>a[i]) {
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        }
        System.out.println("排序后的数组是："+Arrays.toString(a));
    }



}
