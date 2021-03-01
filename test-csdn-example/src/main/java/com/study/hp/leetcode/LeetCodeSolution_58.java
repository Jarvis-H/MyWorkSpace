package com.study.hp.leetcode;

/**
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 * <p>
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 * <p>
 * 示例 1：
 * 输入：s = "Hello World"
 * 输出：5
 * <p>
 * 示例 2：
 * 输入：s = " "
 * 输出：0
 */
public class LeetCodeSolution_58 {
    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        if (end < 0) return 0;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    public static void main(String[] args) {
        String s = "Hell1o World";
        System.out.println(lengthOfLastWord(s));
    }
}
