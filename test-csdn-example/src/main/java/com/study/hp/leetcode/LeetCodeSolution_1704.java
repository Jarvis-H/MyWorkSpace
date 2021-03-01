package com.study.hp.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution_1704 {
    public static boolean halvesAreAlike(String s) {

        String s1 = s.substring(0, s.length() / 2);
        int count1 = 0;
        String s2 = s.substring(s.length() / 2);
        int count2 = 0;
        Set<Character> vowelSet = new HashSet();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');
        for (int i = 0; i < s1.length(); i++) {
            if (vowelSet.contains(s1.charAt(i))) {
                count1++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (vowelSet.contains(s2.charAt(i))) {
                count2++;
            }
        }
        return count1 == count2;
    }

    public static void main(String[] args) {
        String s = "AbCdEfGh";
        System.out.println(halvesAreAlike(s));
    }
}
