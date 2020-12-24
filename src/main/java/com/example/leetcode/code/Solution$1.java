package com.example.leetcode.code;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍
 */
public class Solution$1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            String reduceRes = String.valueOf(target - nums[i]);
            if (map.get(reduceRes) != null){
                System.out.println(String.format("两数的数组下标为： %s , %s ", map.get(reduceRes), i));
                return new int[]{map.get(reduceRes), i};
            } else {
                map.put(String.valueOf(nums[i]), i);
            }
        }
        return new int[0];
    }

    //模板写法
    public static int[] modeMethod(int[] nums, int target){
        int len = nums.length;
        Map<Integer, Integer> hashMap = new HashMap<>(len-1);
        hashMap.put(nums[0], 0);
        for (int i=1;i<len;i++){
            int another = target - nums[i];
            if (hashMap.containsKey(another)){
                return new int[]{i, hashMap.get(another)};
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //Action:
    //  设置map大小
    //  使用map.containKey 替换 map.get(key) 判断是否存在
    //  没有合适结果抛出IllegalArgumentException异常

    public static void main(String[] args) {
        int[] nums = new int[]{6,2,3,4,5,1,7};
        twoSum(nums, 13);
    }
}
