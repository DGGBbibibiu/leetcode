package com.example.leetcode.offer;

import java.util.Arrays;
import java.util.List;

/**
 * @author xiaofan.li
 * @version 1.0
 * @desc 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * @date 2021/1/20 10:15
 */
public class Offer$58_II {

    public static String reverseLeftWords(String s, int n) {
        int len = s.length();
        if (len < 2 || n > len-1) return s;
        String res = s.substring(n, len) + s.substring(0, n);
        return res;
    }

    /**
     * 利用 % 取余遍历字符串
     * @param s
     * @param n
     * @return
     */
    public static String method(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i=n; i< n+ s.length(); i++){
            sb.append(s.charAt(i % s.length()));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "lrloseumgh";
        int n = 3;
        String res = reverseLeftWords(s, n);
        String sb = method(s, n);
        System.out.println(res);
        System.out.print(sb);
    }
}
