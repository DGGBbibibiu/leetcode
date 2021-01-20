package com.example.leetcode.code;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc 一维数组的动态和
 *      给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *      请返回 nums 的动态和。
 * @date 2021/1/14 17:03
 */
public class Solution$1480 {
    public static int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int sum = 0;
        for (int i=0;i<len;i++){
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }

    /**
     * desc: 题解上面一个相比起来更好的思路
     * @param nums
     * @return
     */
    public int[] method(int[] nums) {
        //从数组索引1开始,因为数组索引0的数不用变
        for(int i = 1; i < nums.length; i++){
            //比如数组索引4位置,就是和数组索引3位置的数相加,因为数组索引三已经是和前面的数相加过的和,所以直接和他相加就行
            nums[i] += nums[i - 1];
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] res = runningSum(nums);
        for (int v : res){
            System.out.println(v + "|");
        }
    }
}
