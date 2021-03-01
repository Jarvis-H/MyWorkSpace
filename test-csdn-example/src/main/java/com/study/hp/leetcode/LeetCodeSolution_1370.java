package com.study.hp.leetcode;

public class LeetCodeSolution_1370 {
    public static String sortString(String s) {
        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
        }
        StringBuffer result = new StringBuffer();
        while (result.length() < s.length()) {
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] > 0) {
                    result.append((char) (i + 'a'));
                    bucket[i]--;
                }
            }
            for (int i = bucket.length - 1; i >= 0; i--) {
                if (bucket[i] > 0) {
                    result.append((char) (i + 'a'));
                    bucket[i]--;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(sortString(s));
    }
}
