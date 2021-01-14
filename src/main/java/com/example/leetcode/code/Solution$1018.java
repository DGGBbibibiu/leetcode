package com.example.leetcode.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc 可被 5 整除的二进制前缀
 * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
 *返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
 *
 * @date 2021/1/14 14:38
 */
public class Solution$1018 {

    /**
     * desc: 十进制位数达到一定数量后会超限出错 ERR
     * @param A
     * @return
     */
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int len = A.length;
        for (int i=0; i<len; i++){
            int index = i;
            int sum = 0;
            int n = 0;
            while (index > 0){
                sum += ((Math.pow(2, index)) * A[n]);
                index--;
                n++;
            }
            sum += A[i];
            boolean v = sum % 5 == 0 ? true : false;
            res.add(v);
        }
        return res;
    }

    /**
     * desc: 官网标准解法
     * @param A
     * @return
     */
    public static List<Boolean> method(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int len = A.length;
        int value = 0;
        for (int i=0;i<len;i++){
            value = ((value << 1) + A[i]) % 5;
            res.add(value == 0);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 1, 1, 1, 1};
//        List<Boolean> res = prefixesDivBy5(A);
        List<Boolean> res = method(A);
        System.out.println(res.toString());
    }
}
