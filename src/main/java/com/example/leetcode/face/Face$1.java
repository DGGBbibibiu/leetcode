package com.example.leetcode.face;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc
 * @date 2020/12/24 14:45
 */
public class Face$1 {
    public static boolean isUnique(String astr) {
        int len = astr.length();
        if (len == 0) return true;
        Map<String, Integer> hashMap = new HashMap<>(len);
        hashMap.put(String.valueOf(astr.charAt(0)), 1);
        for (int i = 1;i<len;i++){
            if (hashMap.containsKey(String.valueOf(astr.charAt(i)))){
                return false;
            }
            hashMap.put(String.valueOf(astr.charAt(i)), 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String astr = "abcdefghijk";
        boolean res = isUnique(astr);
        System.out.println(res);
    }
}
