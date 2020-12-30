package com.example.leetcode.offer;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc    求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @date 2020/12/28 11:22
 */
public class Offer$64 {

    public int sumNums(int n) {
        int sum = n;
        boolean flag = n > 0 && (sum += sumNums(n-1)) > 0;
        return sum;
    }
}
