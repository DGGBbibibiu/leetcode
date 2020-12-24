package com.example.leetcode.face;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc  给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * @date 2020/12/24 15:38
 */
public class Face$2 {
    public static boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int[] nums = new int[26];
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            nums[s1.charAt(i)-97]++;
            nums[s2.charAt(i)-97]--;
        }
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }

    //Action:
    //nums[i]++   nums[i] = nums[i]+1
    //a-z  把a的ascii码为97  在数组中设置为0 以此类推  26长度的数组中初始值0填充 ++ --

    public static void main(String[] args) {
        String s1 = "abccbabcdef";
        String s2 = "abcdefcbabc";
        boolean res = CheckPermutation(s1, s2);
        System.out.println(res);
    }
}
