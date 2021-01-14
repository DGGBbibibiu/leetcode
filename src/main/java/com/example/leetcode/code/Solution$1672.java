package com.example.leetcode.code;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc  最富有客户的资产总量
 *      给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 *      客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 *
 * @date 2021/1/14 16:28
 */
public class Solution$1672 {
    public static int maximumWealth(int[][] accounts) {
        int maxAccount = 0;
        int x = accounts[0].length;
        int y = accounts.length;
        for (int i = 0; i<y; i++){
            int sum = 0;
            for (int j=0; j<x; j++){
                sum += accounts[i][j];
            }
            if (sum > maxAccount){
                maxAccount = sum;
            }
        }
        return maxAccount;
    }

    public static void main(String[] args) {
        int[][] accounts = new int[3][3];
        accounts[0][0] = 1;
        accounts[0][1] = 4;
        accounts[0][2] = 7;
        accounts[1][0] = 2;
        accounts[1][1] = 5;
        accounts[1][2] = 8;
        accounts[2][0] = 3;
        accounts[2][1] = 6;
        accounts[2][2] = 9;

        int res = maximumWealth(accounts);
        System.out.println(res);
    }
}
